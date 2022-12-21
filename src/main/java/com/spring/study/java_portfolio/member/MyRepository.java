package com.spring.study.java_portfolio.member;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {
    private String name = "강 병 주";
    private String age = "1987.06.06 ( 만35 )";
    private String address = "인천 계양구";
    private String career = "Web 1년";

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
