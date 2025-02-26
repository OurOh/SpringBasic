package hello.core1.Service;

import hello.core1.dto.Member;

public interface MemberService {

    void join(Member member);

    Member findMember(Long memberId);

}
