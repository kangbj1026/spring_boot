package com.spring.study.java_portfolio.servier;

import com.spring.study.java_portfolio.member.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.LinkedHashMap;

@Service
public class MainServer {

    @Autowired
    private MyRepository my;

    public String getMain(Model model) {
        String introduction = "Introduction";
        String skills = "Skills";

        LinkedHashMap<String, String> introList = new LinkedHashMap<>();
        introList.put("name "," " + my.getName());
        introList.put("age "," " + my.getAge());
        introList.put("address "," " + my.getAddress());
        introList.put("career "," " + my.getCareer());

        LinkedHashMap<String, String> skillsList = new LinkedHashMap<>();

        ArrayList frontEnd = new ArrayList(), backEnd = new ArrayList(), frameWork = new ArrayList();
        frontEnd.add(" HTML, CSS, JavaScript, JQuery, React(초급) ");
        backEnd.add("  PHP, JAVA, Python(기초) ");
        frameWork.add(" Spring, Spring Boot, STS, Codeigniter, GitHub ");

        skillsList.put("FRONT END ", " " + String.valueOf(frontEnd));
        skillsList.put("BACK END ", " " + String.valueOf(backEnd));
        skillsList.put("FrameWork ", " " + String.valueOf(frameWork));

        model.addAttribute("introduction", introduction);
        model.addAttribute("content", introList);
        model.addAttribute("skills", skills);
        model.addAttribute("skillsList", skillsList);
        return "main";
    }

    public LinkedHashMap<String, Object> getTest(String name){
        LinkedHashMap<String, Object> rstMap = new LinkedHashMap<String, Object>();
        rstMap.put("name", name);
        return rstMap;
    }
}