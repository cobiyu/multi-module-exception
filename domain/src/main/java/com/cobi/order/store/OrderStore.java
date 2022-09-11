package com.cobi.order.store;

import com.cobi.order.OrderDomain;

public interface OrderStore {
  OrderDomain createOrder(OrderDomain orderDomain);
}
