package com.example.demo.repository;

import com.example.demo.domain.reviewers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewersRep extends JpaRepository<reviewers, Long> {

}
