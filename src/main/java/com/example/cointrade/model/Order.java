package com.example.cointrade.model;

import com.example.cointrade.dto.OrderFailureReason;
import com.example.cointrade.dto.OrderStatus;
import lombok.Value;

@Value
public class Order {
    Long id;                            // 주문 ID
    String coinId;                      // 코인 ID
    String orderType;                   // 매수 or 매도
    String orderMethod;                 // 시장가 or 지정가
    Double price;                       // 가격
    Double quantity;                    // 주문 수량
    OrderStatus status;                 // 성공, 실패, 취소
    OrderFailureReason failureReason;   // 실패사유
}
