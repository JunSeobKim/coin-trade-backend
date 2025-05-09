package com.example.cointrade.service;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OrderServiceTest {

    @Autowired
    private OrderService orderService;

    @Test
    @Disabled
    @DisplayName("Should place market BUY order and return Order")
    void shouldPlaceMarketBuyOrder() {
        // TODO: coin-014
        throw new UnsupportedOperationException();
    }

    @Test
    @Disabled
    @DisplayName("Should place limit SELL order and return Order")
    void shouldPlaceLimitSellOrder() {
        // TODO: coin-014
        throw new UnsupportedOperationException();
    }

    @Test
    @Disabled
    @DisplayName("Should fail with INSUFFICIENT_BALANCE")
    void shouldFailDueToInsufficientBalance() {
        // TODO: coin-014
        throw new UnsupportedOperationException();
    }

    @Test
    @Disabled
    @DisplayName("Should fail with INSUFFICIENT_COIN")
    void shouldFailDueToInsufficientCoin() {
        // TODO: coin-014
        throw new UnsupportedOperationException();
    }

    @Test
    @Disabled
    @DisplayName("Should fail with UNDER_MIN_ORDER_AMOUNT")
    void shouldFailDueToUnderMinOrderAmount() {
        // TODO: coin-014
        throw new UnsupportedOperationException();
    }

    @Test
    @Disabled
    @DisplayName("Should fail with NO_MATCHED_ORDER")
    void shouldFailDueToNoMatchedOrder() {
        // TODO: coin-014
        throw new UnsupportedOperationException();
    }
}