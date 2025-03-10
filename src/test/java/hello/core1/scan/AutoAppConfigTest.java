package hello.core1.scan;

import hello.core1.AutoAppConfig;
import hello.core1.Service.MemberService;

import hello.core1.Service.OrderServiceImpl;
import hello.core1.repository.MemberRepository;
import hello.core1.repository.MemoryMemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.assertj.core.api.Assertions.*;

public class AutoAppConfigTest {

    @Test
    void basicScan(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(AutoAppConfig.class);

        MemberService memberService = ac.getBean(MemberService.class);
        assertThat(memberService).isInstanceOf(MemberService.class);

        OrderServiceImpl orderService = ac.getBean(OrderServiceImpl.class);
        MemberRepository memberRepository = new MemoryMemberRepository();
        System.out.println("memberRepository = " + memberRepository);

    }
}
