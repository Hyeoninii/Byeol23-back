package com.nhnacademy.byeol23backend.like.repository;

import com.nhnacademy.byeol23backend.like.domain.Like;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeRepository extends JpaRepository<Like, Long> {
}
