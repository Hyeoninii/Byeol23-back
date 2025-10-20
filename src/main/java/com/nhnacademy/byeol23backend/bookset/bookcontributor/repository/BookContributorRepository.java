package com.nhnacademy.byeol23backend.bookset.bookcontributor.repository;

import com.nhnacademy.byeol23backend.bookset.bookcontributor.domain.BookContributor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookContributorRepository extends JpaRepository<BookContributor, Long> {
}
