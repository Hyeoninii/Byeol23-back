package com.nhnacademy.byeol23backend.memberset.member.service;

import com.nhnacademy.byeol23backend.memberset.member.domain.Member;
import com.nhnacademy.byeol23backend.memberset.member.dto.MemberResponseDto;

public interface MemberService {
    MemberResponseDto createMember(Member member);
    MemberResponseDto updateMember(Member member);
    MemberResponseDto getMember(Long memberId);
    void deleteMember(Long memberId);

}
