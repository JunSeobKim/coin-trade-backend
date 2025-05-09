package com.example.cointrade.service;

import com.example.cointrade.dto.OrderRequest;
import com.example.cointrade.model.Order;

public interface OrderService {

    Order postOrder(OrderRequest request);

}
