package com.mohsin.portfolio.model;

import java.time.LocalDateTime;

public class ContactMessage {
    private String name;
    private String email;
    private String phone;
    private String message;
    private LocalDateTime createdAt = LocalDateTime.now();

    // getters & setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    @Override
    public String toString() {
        return "\n📩 NEW CONTACT MESSAGE\n" +
                "Name    : " + name + "\n" +
                "Email   : " + email + "\n" +
                "Phone   : " + phone + "\n" +
                "Message : " + message + "\n";
    }
}
