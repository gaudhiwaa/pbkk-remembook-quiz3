package com.example.demo.repository;

import com.example.demo.domain.review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRep extends JpaRepository<review, Long> {
}
