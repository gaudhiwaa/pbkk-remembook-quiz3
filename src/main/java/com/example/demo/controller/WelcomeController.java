package com.example.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class WelcomeController {
    @RequestMapping("/")
    public String getWelcome(){
        return "welcome";
    }
}
