package com.example.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class RegisterController {
    @RequestMapping("/register")
    public String getRegister(Model model){
        return "register";
    }
}
