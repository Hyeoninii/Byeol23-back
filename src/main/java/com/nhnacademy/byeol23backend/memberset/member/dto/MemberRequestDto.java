package com.nhnacademy.byeol23backend.memberset.member.dto;

import com.nhnacademy.byeol23backend.memberset.member.domain.Member;

public class MemberRequestDto {
    private final Member member;

    public MemberRequestDto(Member member) {
        this.member = member;
    }
}
