package com.nhnacademy.byeol23backend.orderset.refundpolicy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nhnacademy.byeol23backend.orderset.refundpolicy.domain.RefundPolicy;

public interface RefundPolicyRepository extends JpaRepository<RefundPolicy, Long> {
}
