-- 코인 목록 테이블
CREATE TABLE coins (
    coin_id     VARCHAR(20) PRIMARY KEY COMMENT '코인 ID',
    name        VARCHAR(100) COMMENT '코인 이름',
    market      VARCHAR(10) DEFAULT 'KRW',
    FULLTEXT INDEX idx_ft_name_id (name, coin_id)
);

-- 코인 가격 히스토리 테이블
CREATE TABLE coin_price_history (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    coin_id VARCHAR(20) NOT NULL COMMENT '코인 ID',
    trade_date DATE NOT NULL COMMENT '해당 시세의 거래 기준 날짜',
    opening_price DOUBLE COMMENT '시가',
    high_price DOUBLE COMMENT '고가',
    low_price DOUBLE COMMENT '저가',
    trade_price DOUBLE COMMENT '현재가',
    prev_closing_price DOUBLE COMMENT '전일 종가',
    signed_change_price DOUBLE COMMENT '전일 대비 가격 변화 금액',
    signed_change_rate DOUBLE COMMENT '전일 대비 가격 변화율',
    trade_volume DOUBLE COMMENT '해당 날짜의 거래량',
    acc_trade_price_24h DOUBLE COMMENT '24시간 누적 거래대금',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,

    CONSTRAINT fk_coin FOREIGN KEY (coin_id) REFERENCES coins(coin_id)
        ON DELETE CASCADE
        ON UPDATE CASCADE,

    UNIQUE KEY uniq_coin_timestamp (coin_id, trade_date)  -- 하루에 하나만 저장
);
