package com.cobi.order.services;

import com.cobi.order.OrderDomain;
import com.cobi.order.store.OrderStore;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {
  private final OrderStore orderStore;

  public OrderDomain createOrder(Long price) {
    OrderDomain orderDomain = OrderDomain.builder()
        .price(price)
        .build();

    return orderStore.createOrder(orderDomain);
  }
}
