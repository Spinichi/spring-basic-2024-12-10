package com.ll.basic.domain.home.home.controller;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class HomeController {
    private int age = 22;
    private final List<Integer> ages;

    @GetMapping("/")
    @ResponseBody
    public String showMain() {
        return "안녕하세요.";
    }

    @GetMapping("/about")
    @ResponseBody
    public String showAbout() {
        return "저는 홍길동입니다.";
    }

    @GetMapping("/ageUp")
    @ResponseBody
    public int getAgeAndUp() {
        return age++;
    }

    @GetMapping("/boolean")
    @ResponseBody
    public boolean getBoolean() {
        return true;
    }

    @GetMapping("/byte")
    @ResponseBody
    public int getByte() {
        return 127;
    }

    @GetMapping("/char")
    @ResponseBody
    public int getChar() {
        return '꽑';
    }

    @GetMapping("/float")
    @ResponseBody
    public float getFloat() {
        return 3.1f;
    }

    @GetMapping("/double")
    @ResponseBody
    public double getDouble() {
        return 3.141592;
    }

    @GetMapping("/list")
    @ResponseBody
    public List<String> getList() {
        return List.of("a", "b", "c");
    }

    @GetMapping("/article")
    @ResponseBody
    public Article getArticle() {
        return Article
                .builder()
                .body("내용")
                .title("제목")
                .build();
    }

    @GetMapping("/ages")
    @ResponseBody
    public List<Integer> getAges() {
        return ages;
    }
}

@Builder
@Getter
class Article {
    private final long id = 1;
    private final String title;
    private final String body;
    private final boolean isPublished = true ;
}
