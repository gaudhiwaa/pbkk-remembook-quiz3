package com.example.demo.service;

import com.example.demo.domain.reviewers;
import com.example.demo.repository.ReviewersRep;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class reviewersService {
    private final ReviewersRep reviewersRep;

    public reviewersService(ReviewersRep reviewersRep) {
        this.reviewersRep = reviewersRep;
    }

    public List<reviewers> getReviewers(){
        return reviewersRep.findAll();
    }
}
