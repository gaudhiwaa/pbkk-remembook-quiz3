package com.example.demo.service;

import com.example.demo.domain.review;
import com.example.demo.repository.ReviewRep;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class reviewService {
    private final ReviewRep reviewRep;

    public reviewService(ReviewRep reviewRep) {
        this.reviewRep = reviewRep;
    }

    public List<review> getReview(){
        return reviewRep.findAll();
    }
}
