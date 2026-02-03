package org.example.codecoveragedemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JacocoController {


    @GetMapping("/j1")
    public String testJacoco() {
        int a = 0;
        int b = 0;
        int c = 0;
        if (a == 0) {
            b = 1;
        } else {
            b = 2;
        }
        c = b + 1;
        System.out.println("j1 = " + c);
        return "testJacoco";
    }

    @GetMapping("/j2")
    public String testJacoco2() {
        int a = 0;
        int b = 0;
        int c = 0;
        if (a == 0) {
            b = 1;
        } else {
            b = 2;
        }
        c = b + 1;
        System.out.println("j2 = " + c);
        return "testJacoco";
    }
}
