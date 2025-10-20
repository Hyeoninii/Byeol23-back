package com.nhnacademy.byeol23backend.bookset.publisher.repository;

import com.nhnacademy.byeol23backend.bookset.publisher.domain.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
