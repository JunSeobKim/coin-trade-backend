package com.example.cointrade.service;

import com.example.cointrade.dto.OrderRequest;
import com.example.cointrade.model.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Override
    public Order postOrder(OrderRequest request) {
        throw new UnsupportedOperationException();
    }

}
