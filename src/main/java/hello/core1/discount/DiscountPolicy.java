package hello.core1.discount;

import hello.core1.dto.Member;

public interface DiscountPolicy {

    int discount(Member member, int price);
}
