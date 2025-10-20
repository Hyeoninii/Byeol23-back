package com.nhnacademy.byeol23backend.memberset.member.service.impl;

import com.nhnacademy.byeol23backend.memberset.member.domain.Member;
import com.nhnacademy.byeol23backend.memberset.member.exception.MemberNotFoundException;
import com.nhnacademy.byeol23backend.memberset.member.repository.MemberRepository;
import com.nhnacademy.byeol23backend.memberset.member.service.MemberService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
@Slf4j
public class MemberServiceImpl implements MemberService {
    private final MemberRepository memberRepository;

    /**
     * 회원을 저장하는 함수
     * @param member
     * @return member
     */
    @Override
    public Member createMember(Member member) {
        memberRepository.save(member);
        log.info("멤버 생성을 완료했습니다.{}", member.toString());
        return member;
    }

    /**
     * 회원 정보를 수정하는 함수
     * @param member
     * @return void
     */
    @Override
    @Transactional
    public void updateMember(Member member) {
        long memberId = member.getMemberId();
        Member oldMember = getMember(memberId);
        oldMember.update(member);

        log.info("{}를 업데이트 했습니다.", memberId);
    }

    /**
     * 회원을 조회하는 함수
     * @param memberId
     * @return member
     */
    @Override
    public Member getMember(Long memberId) {
        return memberRepository.findById(memberId)
                .orElseThrow(() -> new MemberNotFoundException(memberId + "에 해당하는 멤버를 찾을 수 없습니다."));
    }

    /**
     * 회원을 삭제하는 기능을 구현한 함수이다.
     * 실제로 삭제되지는 않고 상태: 활성 -> 탈퇴 로 변경한다.
     * @param memberId
     * @return void
     */
    @Override
    @Transactional
    public void deleteMember(Long memberId) {
        Member target = getMember(memberId);
        target.setStatus("탈퇴");

        log.info("{}가 삭제되었습니다.", memberId);
    }

}
