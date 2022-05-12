package com.example.demo.bootstrap;

import com.example.demo.domain.review;
import com.example.demo.domain.reviewers;
import com.example.demo.repository.reviewRepository;
import com.example.demo.repository.reviewersRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    private final reviewersRepository reviewersRep;
    private final reviewRepository reviewRep;

    public BootStrapData(reviewersRepository reviewersRep, reviewRepository reviewRep) {
        this.reviewersRep = reviewersRep;
        this.reviewRep = reviewRep;
    }

    @Override
    public void run(String... args) throws Exception{
        reviewers me = new reviewers("Me", "me.com");
        review me1 = new review("Meek book", "Meek", "Its good");

        me.getReview().add(me1);
        me1.getReviewers().add(me);

        reviewRep.save(me1);
        reviewersRep.save(me);
    }
}
