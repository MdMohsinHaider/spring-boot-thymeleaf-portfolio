package com.mohsin.portfolio.controller;

import com.mohsin.portfolio.model.ContactMessage;
import com.mohsin.portfolio.service.ContactMessageStore;
import com.mohsin.portfolio.service.HomeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    private final HomeService homeService;
    private final ContactMessageStore messageStore;

    public HomeController(HomeService homeService,
                          ContactMessageStore messageStore) {
        this.homeService = homeService;
        this.messageStore = messageStore;
    }

    @GetMapping({"/", "", "/home"})
    public String showHomePage(Model model) {
//        model.addAttribute("title", "Home");
//        return "master";

        model.addAttribute("title", "Home");
        model.addAttribute("home", homeService.getHomeContent());
        return "master";
    }

    @GetMapping({"/projects"})
    public String showProjectPage(Model model) {
        model.addAttribute("title", "Projects");
        return "master";
    }

    @GetMapping("/resume")
    public String showResumePage(Model model) {
        model.addAttribute("title", "Resume");
        return "master";
    }

    // SHOW CONTACT PAGE
    @GetMapping("/contact")
    public String showContactPage(Model model) {
//        model.addAttribute("title", "Contact");
//        return "master";

        model.addAttribute("title", "Contact");
        model.addAttribute("contactMessage", new ContactMessage());
        return "master";
    }

    // HANDLE CONTACT FORM
    @PostMapping("/contact")
    public String submitContactForm(@ModelAttribute ContactMessage contactMessage,Model model) {
        messageStore.save(contactMessage);

        model.addAttribute("title", "Contact");
        model.addAttribute("success", true);
        model.addAttribute("contactMessage", new ContactMessage());

        return "master";

    }

}
