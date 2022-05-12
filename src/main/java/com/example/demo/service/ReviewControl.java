package com.example.demo.service;

import com.example.demo.domain.review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/review")
public class ReviewControl {
    private final reviewService reviewSer;

    @Autowired
    public ReviewControl(reviewService reviewSer) {
        this.reviewSer = reviewSer;
    }

    @GetMapping
    public List<review> getReview(){
        return reviewSer.getReview();
    }

//    @PostMapping
//    public void registerNewReviewers(@RequestBody reviewers reviewers){
//        reviewersSer.
//    }
}
