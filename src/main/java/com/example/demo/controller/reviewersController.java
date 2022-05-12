package com.example.demo.controller;

import com.example.demo.repository.reviewersRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class reviewersController {
    private final reviewersRepository reviewersRep;

    public reviewersController(reviewersRepository reviewersRep) {
        this.reviewersRep = reviewersRep;
    }

//    @RequestMapping("api/review")
//    public String getReview(Model model){
//        model.addAttribute("review", reviewRep.findAll());
//
//        return "review1";
//    }
}

