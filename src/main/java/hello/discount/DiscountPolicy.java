package hello.discount;

import hello.core.member.Member;

public interface DiscountPolicy {

    int discount(Member member, int price);
}
