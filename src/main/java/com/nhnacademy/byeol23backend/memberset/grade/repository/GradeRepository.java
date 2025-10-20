package com.nhnacademy.byeol23backend.memberset.grade.repository;

import com.nhnacademy.byeol23backend.memberset.grade.domain.Grade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GradeRepository extends JpaRepository<Grade, Long> {
}
