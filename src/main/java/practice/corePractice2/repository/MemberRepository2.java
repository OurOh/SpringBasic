package practice.corePractice2.repository;

import hello.core1.dto.Member;

public interface MemberRepository2 {

    Member findById(Long memberId);

    void save(Member member);

}
