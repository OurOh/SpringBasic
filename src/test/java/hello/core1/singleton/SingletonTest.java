package hello.core1.singleton;

import hello.core1.AppConfig;
import hello.core1.Service.MemberService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SingletonTest {

    @Test
    @DisplayName("스프링없는 순수 DI 컨테이너")
    void pureContainer(){

        AppConfig appConfig = new AppConfig();
        //1 조회 호출할 때마다 객체를 생성
        MemberService memberService1 = appConfig.memberService();

        //2 조회 호출할 때마다 객체 생성
        MemberService memberService2 = appConfig.memberService();

        //참조값이 다른것을 확인
        System.out.println("memberService1 = " + memberService1);
        System.out.println("memberService1 = " + memberService2);

        assertThat(memberService1).isNotSameAs(memberService2);
    }
}
