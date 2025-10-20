package com.nhnacademy.byeol23backend.bookset.category.repository;

import com.nhnacademy.byeol23backend.bookset.category.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
