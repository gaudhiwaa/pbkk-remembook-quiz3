package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReadingListController {
    @RequestMapping("/readingList")
    public String getRegister(){
        return "readingList";
    }
}
