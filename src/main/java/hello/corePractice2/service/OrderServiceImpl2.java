package hello.corePractice2.service;

import hello.core1.Service.OrderService;
import hello.core1.dto.Member;
import hello.corePractice2.discount.DiscountPolicy;
import hello.corePractice2.discount.FixDiscountPolicy;
import hello.core1.dto.Order;
import hello.corePractice2.repository.MemberRepository;
import hello.corePractice2.repository.MemoryMemberRepository;

public class OrderServiceImpl2 implements OrderService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();


    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {

        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
