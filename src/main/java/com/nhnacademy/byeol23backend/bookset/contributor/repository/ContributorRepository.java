package com.nhnacademy.byeol23backend.bookset.contributor.repository;

import com.nhnacademy.byeol23backend.bookset.contributor.domain.Contributor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContributorRepository extends JpaRepository<Contributor, Long> {
}
