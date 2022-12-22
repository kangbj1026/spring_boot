package com.spring.study.java_portfolio.servier;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class ContactServer {

    public String getContact(Model model) {
        return "contact";
    }
}
