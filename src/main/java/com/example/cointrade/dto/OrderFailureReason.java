package com.example.cointrade.dto;

public enum OrderFailureReason {
    INSUFFICIENT_BALANCE,    // 잔고 부족
    INSUFFICIENT_COIN,       // 보유 코인 부족
    UNDER_MIN_ORDER_AMOUNT,  // 최소 주문 금액 미만
    NO_MATCHED_ORDER         // 지정가 주문 실패
}
