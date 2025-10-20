package com.nhnacademy.byeol23backend.orderset.order.repository;

import com.nhnacademy.byeol23backend.orderset.order.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
