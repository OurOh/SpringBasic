package hello.core1.order;

import hello.core1.AppConfig;
import hello.core1.Service.MemberService;
import hello.core1.Service.MemberServiceImpl;
import hello.core1.Service.OrderService;
import hello.core1.Service.OrderServiceImpl;
import hello.core1.dto.Grade;
import hello.core1.dto.Member;
import hello.core1.dto.Order;
import org.assertj.core.api.Assertions;
import org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {

    MemberService memberService;
    OrderService orderService;

    @BeforeEach
    public void beforeEach() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
        orderService = appConfig.orderService();
    }

    @Test
    void createOrder(){
        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId,"itemA",10000);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }

}
