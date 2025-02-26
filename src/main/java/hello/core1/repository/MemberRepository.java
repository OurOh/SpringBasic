package hello.core1.repository;

import hello.core1.dto.Member;

public interface MemberRepository {

    void save(Member member);

    Member findById(Long memberId);
}
