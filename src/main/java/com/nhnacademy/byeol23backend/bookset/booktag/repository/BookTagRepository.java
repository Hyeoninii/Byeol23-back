package com.nhnacademy.byeol23backend.bookset.booktag.repository;


import com.nhnacademy.byeol23backend.bookset.booktag.domain.BookTag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookTagRepository extends JpaRepository<BookTag, Long> {
}
