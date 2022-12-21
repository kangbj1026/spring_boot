package com.spring.study.java_portfolio.servier;

import com.spring.study.java_portfolio.member.MemberRepository;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class MainServer {

    @Autowired
    private MemberRepository mb;

    public String getMain(Model model) {
        LinkedHashMap<String, String> introList = new LinkedHashMap<>();
        introList.put(" name "," " + mb.getName());
        introList.put("age "," " + mb.getAge() + "\n");
        introList.put("address "," " + mb.getAddress() + "\n");
        introList.put("career "," " + mb.getCareer() + "\n");

        String introduction = "Introduction";

        model.addAttribute("spring", "Spring Boot MVC Portfolio ");
        model.addAttribute("introduction", introduction);
        model.addAttribute("content", introList);
        return "main";
    }

    public LinkedHashMap<String, Object> getTest(String name){
        LinkedHashMap<String, Object> rstMap = new LinkedHashMap<String, Object>();
        rstMap.put("name", name);
        return rstMap;
    }
}
