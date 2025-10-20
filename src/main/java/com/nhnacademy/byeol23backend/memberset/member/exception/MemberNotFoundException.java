package com.nhnacademy.byeol23backend.memberset.member.exception;

/**
 * 데이터베이스에서 회원과 일치하는 memberId를 찾지 못했을 경우 발생하는 예외
 */
public class MemberNotFoundException extends RuntimeException {
    public MemberNotFoundException(String s) {
    }
}
