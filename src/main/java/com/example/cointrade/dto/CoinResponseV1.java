package com.example.cointrade.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Value;

@Value
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class CoinResponseV1 {
    String coinId;
    String name;
    Double tradePrice;
    Double signedChangePrice;
    Double accTrade24hPrice;
}
