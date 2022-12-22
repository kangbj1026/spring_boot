package com.spring.study.java_portfolio.controller;

import com.spring.study.java_portfolio.servier.ContactServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactController {

    @Autowired
    private ContactServer sc;

    @GetMapping("contact")
    public String getMainPage(Model model) {
        return sc.getContact(model);
    }
}
