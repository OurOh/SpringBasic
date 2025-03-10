package practice.corePractice2.repository;

import hello.core1.dto.Member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository2 implements MemberRepository2 {

    private static Map<Long, Member> store = new HashMap<>();

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }

    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }
}
