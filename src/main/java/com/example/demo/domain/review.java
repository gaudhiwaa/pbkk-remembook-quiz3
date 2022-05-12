package com.example.demo.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "review")
public class review {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "review_id")
    private long id;
    private String title;
    private String author;
    private String description;

    @ManyToMany(mappedBy = "review")
    private Set<reviewers> reviewers = new HashSet<>();

    public review() {
    }

    public review(String title, String author, String description, Set<com.example.demo.domain.reviewers> reviewers) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.reviewers = reviewers;
    }

    public review(String title, String author, String description) {
        this.title = title;
        this.author = author;
        this.description = description;
    }

    public review(long id, String title, String author, String description, Set<com.example.demo.domain.reviewers> reviewers) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.description = description;
        this.reviewers = reviewers;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<com.example.demo.domain.reviewers> getReviewers() {
        return reviewers;
    }

    public void setReviewers(Set<com.example.demo.domain.reviewers> reviewers) {
        this.reviewers = reviewers;
    }

    @Override
    public String toString() {
        return "review{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", description='" + description + '\'' +
                ", reviewers=" + reviewers +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        review review = (review) o;

        return id == review.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }
}
