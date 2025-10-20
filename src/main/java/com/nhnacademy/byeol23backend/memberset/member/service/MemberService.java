package com.nhnacademy.byeol23backend.memberset.member.service;

import com.nhnacademy.byeol23backend.memberset.member.domain.Member;
import com.nhnacademy.byeol23backend.memberset.member.exception.MemberNotFoundException;

public interface MemberService {
    Member createMember(Member member);
    void updateMember(Member member);
    Member getMember(Long memberId);
    void deleteMember(Long memberId);

}
