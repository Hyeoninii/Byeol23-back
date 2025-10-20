package com.nhnacademy.byeol23backend.memberset.address.repository;

import com.nhnacademy.byeol23backend.memberset.address.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
