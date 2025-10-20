package com.nhnacademy.byeol23backend.couponset.bookcoupon.repository;

import com.nhnacademy.byeol23backend.couponset.bookcoupon.domain.BookCouponPolicy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookCouponRepository extends JpaRepository<BookCouponPolicy, Long> {
}
