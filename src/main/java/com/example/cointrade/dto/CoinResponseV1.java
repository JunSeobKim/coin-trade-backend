package com.example.cointrade.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Value;

@Value
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class CoinResponseV1 {
    final String coinId;
    final String name;
    final Double tradePrice;
    final Double signedChangePrice;
    final Double accTrade24hPrice;
}