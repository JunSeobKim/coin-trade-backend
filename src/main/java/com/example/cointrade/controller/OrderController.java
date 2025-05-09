package com.example.cointrade.controller;

import com.example.cointrade.dto.CoinResponseV1;
import com.example.cointrade.dto.OrderRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class OrderController {

    @PostMapping("/v1/orders")
    public ResponseEntity<List<CoinResponseV1>> postOrder(
            @RequestBody OrderRequest orderRequest
            ) {
        throw new UnsupportedOperationException();
    }
}
