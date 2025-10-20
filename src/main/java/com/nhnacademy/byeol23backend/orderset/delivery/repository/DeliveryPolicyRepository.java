package com.nhnacademy.byeol23backend.orderset.delivery.repository;

import com.nhnacademy.byeol23backend.orderset.delivery.domain.DeliveryPolicy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliveryPolicyRepository extends JpaRepository<DeliveryPolicy, Long> {
}
