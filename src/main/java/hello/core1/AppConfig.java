package hello.core1;

import hello.core1.Service.MemberService;
import hello.core1.Service.MemberServiceImpl;
import hello.core1.Service.OrderService;
import hello.core1.Service.OrderServiceImpl;
import hello.core1.discount.DiscountPolicy;
import hello.core1.discount.FixDiscountPolicy;
import hello.core1.discount.RateDiscountPolicy;
import hello.core1.repository.MemberRepository;
import hello.core1.repository.MemoryMemberRepository;

public class AppConfig {

    //역할과 구현

    public MemberService memberService() {
        return new MemberServiceImpl (memberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(
                memberRepository(),
                discountPolicy());
    }

    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public DiscountPolicy discountPolicy() {
        //return new FixDiscountPolicy();
        // 배우를 교체한다.
        return new RateDiscountPolicy();
    }

}
