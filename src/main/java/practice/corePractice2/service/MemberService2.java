package practice.corePractice2.service;

import hello.core1.dto.Member;

public interface MemberService2 {

    Member findMember(Long memberId);

    void join(Member member);

}
