package practice.corePractice2.discount;

import hello.core1.dto.Grade;
import hello.core1.dto.Member;
import org.springframework.stereotype.Component;

@Component
public class FixDiscountPolicy2 implements DiscountPolicy2 {

    private int discountFixAmount = 1000;

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return discountFixAmount;
        } else {
            return 0;
        }

    }
}
