package com.mohsin.portfolio.service.impl;

import com.mohsin.portfolio.dto.HomeContent;
import com.mohsin.portfolio.service.HomeService;
import org.springframework.stereotype.Service;

@Service
public class HomeServiceImpl implements HomeService {
    @Override
    public HomeContent getHomeContent() {
        HomeContent home = new HomeContent();

        home.setTag("JAVA FULL STACK DEVELOPER");
        home.setSubtitle("Spring Boot • REST APIs");
        home.setTitle("I build scalable web applications");
        home.setPrimaryButton("View Resume");
        home.setSecondaryButton("My Projects");

        return home;
    }
}
