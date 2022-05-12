package com.example.demo.service;

import com.example.demo.domain.reviewers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/reviewers")
public class ReviewersControl {
    private final reviewersService reviewersSer;

    @Autowired
    public ReviewersControl(reviewersService reviewersSer) {
        this.reviewersSer = reviewersSer;
    }


    @GetMapping
    public List<reviewers> getReviewers(){
        return reviewersSer.getReviewers();
    }

//    @PostMapping
//    public void registerNewReviewers(@RequestBody reviewers reviewers){
//        reviewersSer.
//    }
}
