package com.example.demo.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class YourReviewController {
    @RequestMapping("/yourReview")
    public String getRegister(){
        return "yourReview";
    }
}
