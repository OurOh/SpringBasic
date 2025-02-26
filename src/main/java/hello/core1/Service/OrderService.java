package hello.core1.Service;

import hello.core1.dto.Order;

public interface OrderService {

    Order createOrder(Long memberId, String itemName, int itemPrice);
}
