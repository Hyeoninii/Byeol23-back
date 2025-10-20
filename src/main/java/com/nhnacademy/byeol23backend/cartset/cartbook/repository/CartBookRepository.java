package com.nhnacademy.byeol23backend.cartset.cartbook.repository;

import com.nhnacademy.byeol23backend.cartset.cartbook.domain.CartBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartBookRepository extends JpaRepository<CartBook, Long> {
}
