package com.example.demo;

import org.springframework.core.io.ClassPathResource;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@RestController
public class CalculatorController {

    @GetMapping("/")
    public String home() {
        try {
            ClassPathResource resource = new ClassPathResource("RESULT.md");
            byte[] bytes = StreamUtils.copyToByteArray(resource.getInputStream());
            String content = new String(bytes, StandardCharsets.UTF_8);
            return "<html><body><h1>Test Execution Report</h1><pre>" + content + "</pre></body></html>";
        } catch (IOException e) {
            return "Error reading RESULT.md: " + e.getMessage();
        }
    }

    @GetMapping("/add")
    public int add(
            @RequestParam int a,
            @RequestParam int b) {

        return a + b;
    }
}