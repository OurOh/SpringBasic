package practice.corePractice2.service;

import hello.core1.Service.MemberService;
import hello.core1.dto.Member;
import hello.core1.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import practice.corePractice2.repository.MemberRepository2;
import practice.corePractice2.repository.MemoryMemberRepository2;

public class MemberServiceImpl2 implements MemberService2 {

    private final MemberRepository2 memberRepository = new MemoryMemberRepository2();

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }
}
