package com.example.codecoveragedemo.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class StaticController {
    @GetMapping("/bb")
    public String testJacoco() {
        System.out.println("bb = " + 2);
        return "bb";
    }
}
