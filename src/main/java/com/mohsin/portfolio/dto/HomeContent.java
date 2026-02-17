package com.mohsin.portfolio.dto;

public class HomeContent {
    private String tag;
    private String subtitle;
    private String title;
    private String primaryButton;
    private String secondaryButton;

    // getters & setters

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getPrimaryButton() {
        return primaryButton;
    }

    public void setPrimaryButton(String primaryButton) {
        this.primaryButton = primaryButton;
    }

    public String getSecondaryButton() {
        return secondaryButton;
    }

    public void setSecondaryButton(String secondaryButton) {
        this.secondaryButton = secondaryButton;
    }
}
