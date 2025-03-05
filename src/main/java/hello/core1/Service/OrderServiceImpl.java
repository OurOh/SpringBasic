package hello.core1.Service;

import hello.core1.discount.RateDiscountPolicy;
import hello.core1.dto.Member;
import hello.core1.repository.MemberRepository;
import hello.core1.repository.MemoryMemberRepository;
import hello.core1.discount.DiscountPolicy;
import hello.core1.discount.FixDiscountPolicy;
import hello.core1.dto.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderServiceImpl implements OrderService {

    //필드(멤버 변수)
    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;

    //@Autowired를 사용하면 생성자에서 여러 의존관계도 한번에 주입받을 수 있다.
    @Autowired
    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }
    //OrderServiceImpl orderService = new OrderServiceImpl(new MemoryMemberRepository(), new RateDiscountPolicy());

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);
        return new Order(memberId, itemName, itemPrice, discountPrice);
    }

}
