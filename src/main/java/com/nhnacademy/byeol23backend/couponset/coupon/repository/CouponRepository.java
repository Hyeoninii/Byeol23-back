package com.nhnacademy.byeol23backend.couponset.coupon.repository;

import com.nhnacademy.byeol23backend.couponset.coupon.domain.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponRepository extends JpaRepository<Coupon, Long> {
}
