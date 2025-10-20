package com.nhnacademy.byeol23backend.bookset.bookcategory.repository;

import com.nhnacademy.byeol23backend.bookset.bookcategory.domain.BookCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookCategoryRepository extends JpaRepository<BookCategory, Long> {
}
