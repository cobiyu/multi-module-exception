package com.cobi.order.controllers;

import com.cobi.order.OrderDomain;
import com.cobi.order.services.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class OrderController {
  private final OrderService orderService;

  @PostMapping("/order")
  public OrderDomain createOrder() {
//    Long price = 29000L;
    Long price = -29000L;

    OrderDomain orderDomain = orderService.createOrder(price);

    return orderDomain;
  }
}
