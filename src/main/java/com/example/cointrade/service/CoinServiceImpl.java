package com.example.cointrade.service;

import com.example.cointrade.model.Coin;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoinServiceImpl implements CoinService {

    @Override
    public List<Coin> getCoins(String coinId, String name) {
        throw new UnsupportedOperationException();
    }

}
