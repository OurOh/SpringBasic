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
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//설정을 구성한다는 뜻
@Configuration
public class AppConfig {

    //구성 영역. 객체를 생성하고 구성(Configuration)하는 영역

    //역할과 구현 / 역할에 따른 구현

    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(),discountPolicy());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public DiscountPolicy discountPolicy() {
        // return new FixDiscountPolicy();
        // 배우를 교체한다.
        return new RateDiscountPolicy();
    }

}
