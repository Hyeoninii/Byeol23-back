package com.nhnacademy.byeol23backend.orderset.refund.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nhnacademy.byeol23backend.orderset.refund.domain.Refund;

public interface RefundRepository extends JpaRepository<Refund, Long> {
}
