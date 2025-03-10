package practice.corePractice2.service;

import hello.core1.dto.Order;

public interface OrderService2 {

    Order createOrder(Long memberId, String itemName, int itemPrice);

}
