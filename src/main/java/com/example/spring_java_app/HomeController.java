package com.example.spring_java_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Spring Boot Application Running Successfully";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello Faisal!";
    }
}
