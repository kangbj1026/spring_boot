package com.spring.study.java_portfolio.controller;

import com.spring.study.java_portfolio.servier.MainServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.LinkedHashMap;

@Controller
public class MainController {

    @Autowired
    private MainServer sc;

    @GetMapping("/")
    public String getMainPage(Model model) {
        return sc.getMain(model);
    }

    @GetMapping("/test")
    public LinkedHashMap<String, Object> getTest(@RequestParam("name") String name){
        return sc.getTest(name);
    }
}
