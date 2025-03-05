package practice.corePractice2.service;

import hello.core1.Service.MemberService;
import hello.core1.dto.Member;
import hello.core1.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberServiceImpl2 implements MemberService {

    private final MemberRepository memberRepository;

    //@Autowired를 사용하면 생성자에서 여러 의존관계도 한번에 주입받을 수 있다.
    @Autowired
    public MemberServiceImpl2(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }

}
