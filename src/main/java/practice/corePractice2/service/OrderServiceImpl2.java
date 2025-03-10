package practice.corePractice2.service;

import hello.core1.Service.OrderService;
import hello.core1.discount.DiscountPolicy;
import hello.core1.discount.FixDiscountPolicy;
import hello.core1.dto.Member;
import hello.core1.repository.MemberRepository;
import hello.core1.repository.MemoryMemberRepository;
import practice.corePractice2.discount.DiscountPolicy2;
import practice.corePractice2.discount.FixDiscountPolicy2;
import hello.core1.dto.Order;
import practice.corePractice2.repository.MemberRepository2;
import practice.corePractice2.repository.MemoryMemberRepository2;

public class OrderServiceImpl2 implements OrderService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {

        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, itemPrice);
    }

}
