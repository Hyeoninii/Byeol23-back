package com.nhnacademy.byeol23backend.orderset.orderdetail.repository;

import com.nhnacademy.byeol23backend.orderset.orderdetail.domain.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long> {
}
