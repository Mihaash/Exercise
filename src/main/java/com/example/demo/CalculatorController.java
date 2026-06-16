package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping("/")
    public String home() {
        return "Application Running";
    }

    @GetMapping("/add")
    public int add(
            @RequestParam int a,
            @RequestParam int b) {

        return a + b;
    }
}