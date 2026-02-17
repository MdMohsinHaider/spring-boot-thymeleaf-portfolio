package com.mohsin.portfolio.service.impl;

import com.mohsin.portfolio.model.FooterContent;
import com.mohsin.portfolio.service.FooterService;
import org.springframework.stereotype.Service;

import java.time.Year;

@Service
public class FooterServiceImpl implements FooterService {
    @Override
    public FooterContent getFooterContent() {

        FooterContent footer = new FooterContent();

        footer.setCopyright(
                "© " + Year.now().getValue() + " Md Mohsin Haider. All rights reserved."
        );
        footer.setPrivacyText("Privacy");
        footer.setTermsText("Terms");
        footer.setContactText("Contact");

        return footer;
    }
}
