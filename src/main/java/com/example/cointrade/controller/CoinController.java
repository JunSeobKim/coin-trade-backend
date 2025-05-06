package com.example.cointrade.controller;

import com.example.cointrade.dto.CoinResponseV1;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CoinController {

    @GetMapping("/v1/coins")
    public ResponseEntity<List<CoinResponseV1>> getCoins(
            @RequestParam(required = false) String coinId,
            @RequestParam(required = false) String name
    ) {
        throw new UnsupportedOperationException();
    }

}
