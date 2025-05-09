package com.example.cointrade.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Value;

@Value
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class OrderRequest {
    final String coinId;
    final String orderType;
    final String orderMethod;
    final Integer price;
    final Double quantity;
}
