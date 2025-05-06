package com.example.cointrade.service;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CoinServiceImplTest {

    @Autowired
    private CoinService coinService;

    @Test
    @Disabled
    @DisplayName("should return getCoins service")
    void shouldReturnGetCoins() {
        throw new UnsupportedOperationException();
    }
}
