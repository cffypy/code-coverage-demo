package org.example.codecoveragedemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @GetMapping("/test")
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
        System.out.println("c = " + c);
        return "testJacoco";
    }

    @GetMapping("/test2")
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
        System.out.println("c = " + c);
        return "testJacoco";
    }
}
