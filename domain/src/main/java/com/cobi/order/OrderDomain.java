package com.cobi.order;

import lombok.Builder;
import lombok.Getter;

@Getter
public class OrderDomain {
  private Long orderId;
  private Long price;

  @Builder
  public OrderDomain(Long orderId, Long price) {
    this.orderId = orderId;
    this.price = price;
  }
}
