package com.cobi.order.store;

import com.cobi.order.Order;
import com.cobi.order.OrderDomain;
import com.cobi.order.exception.InvalidPriceException;
import com.cobi.order.repositories.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class OrderStoreJpa implements OrderStore{
  private final OrderRepository orderRepository;
  
  @Override
  public OrderDomain createOrder(
      OrderDomain orderDomain
  ) {
    // price가 음수일 경우 InvalidPriceException
    if (orderDomain.getPrice() < 0) {
      throw new InvalidPriceException("invalid price");
    }

    // order entity 생성
    Order order = Order.builder()
        .price(orderDomain.getPrice())
        .build();

    // order entity save
    order = orderRepository.save(order);

    // 생성된 entity -> domain 형태로 return
    return OrderDomain.builder()
        .orderId(order.getOrderId())
        .price(order.getPrice())
        .build();
  }
}
