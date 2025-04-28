package com.example.cointrade.service;

import com.example.cointrade.dto.CoinResponseV1;

import java.util.List;

public interface CoinService {

    List<CoinResponseV1> getCoins(String coinId, String name);

}
