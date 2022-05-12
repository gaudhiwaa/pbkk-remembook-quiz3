package com.example.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class LoginController {
    @RequestMapping("/login")
    public String getLogin(Model model){
        return "login";
    }
}
