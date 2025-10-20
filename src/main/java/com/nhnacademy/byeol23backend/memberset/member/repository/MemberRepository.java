package com.nhnacademy.byeol23backend.memberset.member.repository;

import com.nhnacademy.byeol23backend.memberset.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
