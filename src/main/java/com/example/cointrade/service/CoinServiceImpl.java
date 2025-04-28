package com.example.cointrade.service;

import com.example.cointrade.dto.CoinResponseV1;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoinServiceImpl implements CoinService {

    @Override
    public List<CoinResponseV1> getCoins(String coinId, String name) {
        throw new UnsupportedOperationException();
    }

}
