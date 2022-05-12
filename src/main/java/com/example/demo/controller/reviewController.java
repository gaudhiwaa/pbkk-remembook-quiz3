package com.example.demo.controller;

import com.example.demo.repository.reviewRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//@RestController
//@RequestMapping(path = "review")

@Controller
public class reviewController {
    private final reviewRepository reviewRep;

    public reviewController(reviewRepository reviewRep) {
        this.reviewRep = reviewRep;
    }

    @RequestMapping("api/review")
    public String getReview(Model model){
        model.addAttribute("review", reviewRep.findAll());

        return "review1";
    }
}
