package com.example.cointrade.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Value;

@Value
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class OrderResponseV1 {
    final int orderId;
    final OrderStatus status;
    final OrderFailureReason message;
}
