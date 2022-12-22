package com.spring.study.java_portfolio.servier;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Map;

@Service
public class ProjectServer {

    public String getProject(Model model) {
        model.addAttribute("projects", "Project List");
        String nesteel = "스틸하우스 & 목조주택의 홈페이지로 사용하는 웹 쇼핑몰 사이트입니다.\n" +
                "상품을 판매하고 문의하는 사이트로 판매 물품은 자재건축 내외장재 입니다.\n\n" +
                "쇼핑몰 사이트 재구성\n" +
                "검색 시 자동 완성 , 상품 상세 정보 추가개발\n" +
                "관리자 페이지 카테고리 추가 개발 및 페이지 구성\n";
        String meritint = "메리트int 직원들을 위한 건물관리 보고서 홈페이지로 사용되는 웹 사이트입니다.\n" +
                "건물 안내문 및 공지문 설치, 하자보수 , 지하실/옥상 등을 점검 후 일일업무 기록하고 확인하는 플랫폼입니다.\n\n" +
                "javaScript 캘린더로 메인 페이지 달력 구현\n" +
                "해당 날짜 클릭시 원하는 목록에 게시글이 나오도록 Ajax 구현\n" +
                "Jquery를 사용하여 입력 시 합산이 되어 총합에 출력 되도록 구현\n";
        String lotto = "고객분들께 로또 번호를 추첨 및 당첨 여부까지 확인해주는 웹 사이트입니다.\n" +
                "고객의 번호로 가입 후 추첨 받은 번호의 당첨 여부까지 고객이 직접 확인 할 수 있습니다.\n\n" +
                "동행복권사이트에서 로또 최신회차 확인 후 프로젝트 웹 사이트 최신회차 게시글이 등록되지 않았을 경우 자동으로 등록 되도록 구현\n" +
                "동행복권사이트에서 입력된 로또 최신 회차별 당첨번호를 확인하여, 등수/당첨 인원/당첨 금액 등을 크롤링 하여 프로젝트 웹 사이트 메인에 출력\n" +
                "관리자 페이지에서 랜덤으로 6자리 숫자를 등록된 모든 회원들에게 총 10회 다르게 입력되도록 구현\n" +
                "최신회차번호 게시글과 회원 추첨번호를 모두 비교하여 당첨여부 구현\n";
        String[] titles = {"네스틸코리아(주)", "메리트int", "로또사이트"};
        String[] dates = {"2021.11 ~ 2022.01", "2022.01 ~ 2022.03", "2022.04 ~ 2022.05"};
        String[] apis = {"Tmap, kakaomap", "Google Calendar API", "LottoNumber(로또 회차 번호)"};
        String[] checks = {nesteel,meritint,lotto};
        String[] urls = {"http://nesteel.cafe24.com", "https://meritint.cafe24.com", "https://kmwkiin2000.cafe24.com"};
        String[] img = {"img/nesteelMain.png", "img/meritintMain.png", "img/lottohMain.png"};
        model.addAttribute("titles", titles);
        model.addAttribute("dates", dates);
        model.addAttribute("apis", apis);
        model.addAttribute("checks", checks);
        model.addAttribute("urls", urls);
        model.addAttribute("imgs", img);
        return "projects";
    }
}