package com.nhnacademy.byeol23backend.orderset.packaging.repository;

import com.nhnacademy.byeol23backend.orderset.packaging.domain.Packaging;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PackagingRepository extends JpaRepository<Packaging, Long> {
}
