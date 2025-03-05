package practice.corePractice2.discount;

import hello.core1.discount.DiscountPolicy;
import hello.core1.dto.Grade;
import hello.core1.dto.Member;
import org.springframework.stereotype.Component;

@Component
public class RateDiscountPolicy2 implements DiscountPolicy {

    private int discountPercent  = 10;

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return price * discountPercent / 100;
        }else {
            return 0;
        }
    }

}
