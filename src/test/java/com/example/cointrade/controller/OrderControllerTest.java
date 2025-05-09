package com.example.cointrade.controller;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderControllerTest {

    @Test
    @Disabled
    @DisplayName("should create market BUY order successfully and return OrderResponseV1")
    void shouldCreateMarketBuyOrder() {
        // TODO: coin-013 매수 주문 성공
        throw new UnsupportedOperationException();
    }

    @Test
    @Disabled
    @DisplayName("Should create SELL order successfully")
    void shouldCreateSellOrder() {
        // TODO: coin-013 매도 주문 성공
        throw new UnsupportedOperationException();
    }

    @Test
    @Disabled
    @DisplayName("Should fail order due to insufficient balance")
    void shouldFailDueToInsufficientBalance() {
        // TODO: coin-013 매수 잔고 부족
        throw new UnsupportedOperationException();
    }

    @Test
    @Disabled
    @DisplayName("Should fail order due to insufficient coin")
    void shouldFailDueToInsufficientCoin() {
        // TODO: coin-016 매도 코인 부족
        throw new UnsupportedOperationException();
    }

    @Test
    @Disabled
    @DisplayName("Should fail order due to under minimum order amount")
    void shouldFailDueToUnderMinOrderAmount() {
        // TODO: coin-017 최소 주문 미만
        throw new UnsupportedOperationException();
    }

    @Test
    @Disabled
    @DisplayName("Should fail limit order due to no matched order")
    void shouldFailDueToNoMatchedOrder() {
        // TODO: coin-018 지정가 주문 시 체결 가능한 주문 없음
        throw new UnsupportedOperationException();
    }
}