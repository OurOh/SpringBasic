package practice.corePractice2.repository;

import hello.core1.dto.Member;

public interface MemberRepository2 {

    void save(Member member);

    Member findById(Long memberId);

}
