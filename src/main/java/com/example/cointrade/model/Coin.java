package com.example.cointrade.model;

import lombok.Value;

@Value
public class Coin {
    final String coinId;
    final String name;
    final Double tradePrice;
    final Double signedChangePrice;
    final Double accTrade24hPrice;
}
