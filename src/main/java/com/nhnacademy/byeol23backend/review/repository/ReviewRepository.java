package com.nhnacademy.byeol23backend.review.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nhnacademy.byeol23backend.review.domain.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
