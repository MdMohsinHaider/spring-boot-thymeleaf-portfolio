package com.mohsin.portfolio.controller;

import com.mohsin.portfolio.service.FooterService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public class GlobalModelAdvice {

    private final FooterService footerService;

    public GlobalModelAdvice(FooterService footerService) {
        this.footerService = footerService;
    }

    @ModelAttribute
    public void addGlobalAttributes(Model model) {
        model.addAttribute("footer", footerService.getFooterContent());
    }
}
