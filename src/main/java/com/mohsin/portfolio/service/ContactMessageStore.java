package com.mohsin.portfolio.service;

import com.mohsin.portfolio.model.ContactMessage;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class ContactMessageStore {

    private final List<ContactMessage> messages = new ArrayList<>();

    public void save(ContactMessage message) {
        messages.add(message);
        System.out.println(messages); // test
    }

    public List<ContactMessage> findAll() {
        return Collections.unmodifiableList(messages);
    }

}
