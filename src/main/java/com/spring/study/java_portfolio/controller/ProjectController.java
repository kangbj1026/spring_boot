package com.spring.study.java_portfolio.controller;

import com.spring.study.java_portfolio.servier.ProjectServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjectController {

    @Autowired
    private ProjectServer sc;

    @GetMapping("projects")
    public String projects(Model model) {
        return sc.getProject(model);
    }
}