package practice.corePractice2.service;

import hello.core1.dto.Member;

public interface MemberService2 {

    void join(Member member);

    Member findMember(Long memberId);

}
