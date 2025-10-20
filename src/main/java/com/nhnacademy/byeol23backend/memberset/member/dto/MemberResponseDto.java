package com.nhnacademy.byeol23backend.memberset.member.dto;

import com.nhnacademy.byeol23backend.memberset.member.domain.Member;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

/*
- 회원에 대한 정보를 반환할 때 필요한 데이터를 모아 놓은 객체입니다.
*/
@NoArgsConstructor
@Getter
public class MemberResponseDto {
    private String loginId;
    private String memberName;
    private String nickname;
    private String phoneNumber;
    private String email;
    private LocalDate birthday;
    private String status;
    private BigDecimal currentPoint;

    public MemberResponseDto(Member member) {
        this.loginId = member.getLoginId();
        this.memberName = member.getMemberName();
        this.nickname = member.getNickname();
        this.phoneNumber = member.getPhoneNumber();
        this.email = member.getEmail();
        this.birthday = member.getBirthday();
        this.status = member.getStatus();
        this.currentPoint = member.getCurrentPoint();
    }
}
