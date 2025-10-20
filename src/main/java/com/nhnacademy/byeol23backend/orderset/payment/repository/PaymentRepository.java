package com.nhnacademy.byeol23backend.orderset.payment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nhnacademy.byeol23backend.orderset.payment.domain.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
