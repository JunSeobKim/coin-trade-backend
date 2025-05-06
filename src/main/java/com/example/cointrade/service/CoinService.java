package com.example.cointrade.service;

import com.example.cointrade.model.Coin;

import java.util.List;

public interface CoinService {

    List<Coin> getCoins(String coinId, String name);

}
