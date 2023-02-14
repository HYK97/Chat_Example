package com.hy.chat_example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
public class TestController {

    @GetMapping("/test")
    public String testController() {
        return "test"+ LocalDateTime.now();
    }
}
