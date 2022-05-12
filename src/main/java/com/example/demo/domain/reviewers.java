package com.example.demo.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "reviewers")
public class reviewers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "reviewers_id")
    private Long id;
    private String name;
    private String email;

    @ManyToMany(mappedBy = "reviewers")
    private Set<review> review = new HashSet<>();

    public reviewers() {
    }

    public reviewers(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public reviewers(String name, String email, Set<com.example.demo.domain.review> review) {
        this.name = name;
        this.email = email;
        this.review = review;
    }

    public reviewers(Long id, String name, String email, Set<com.example.demo.domain.review> review) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.review = review;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<com.example.demo.domain.review> getReview() {
        return review;
    }

    public void setReview(Set<com.example.demo.domain.review> review) {
        this.review = review;
    }

    @Override
    public String toString() {
        return "reviewers{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", review=" + review +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        reviewers reviewers = (reviewers) o;

        return id != null ? id.equals(reviewers.id) : reviewers.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
