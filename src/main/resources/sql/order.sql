CREATE TABLE orders (
    id              BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '주문 ID',
    coin_id         VARCHAR(20) NOT NULL COMMENT '코인 ID',
    order_type      ENUM('BUY', 'SELL') NOT NULL COMMENT '매수 또는 매도',
    order_method    ENUM('MARKET', 'LIMIT') NOT NULL COMMENT '시장가 또는 지정가',
    price           DOUBLE COMMENT '주문 가격 (시장가는 NULL)',
    quantity        DOUBLE NOT NULL COMMENT '주문 수량',
    total_price     DOUBLE GENERATED ALWAYS AS (price * quantity) STORED COMMENT '총 주문 금액',
    status          ENUM('SUCCESS', 'FAILED', 'CANCELLED') NOT NULL COMMENT '주문 상태',
    reason          VARCHAR(255) COMMENT '주문 실패 시 사유',
    created_at      TIMESTAMP DEFAULT CURRENT_TIMESTAMP,

    CONSTRAINT fk_coin_order FOREIGN KEY (coin_id) REFERENCES coins(coin_id)
);

CREATE TABLE wallet (
    coin_id         VARCHAR(20) PRIMARY KEY COMMENT '보유 코인 ID',
    balance         DOUBLE NOT NULL DEFAULT 0 COMMENT '보유 수량'
);
