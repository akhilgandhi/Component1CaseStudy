USE stockDb;

CREATE TABLE IF NOT EXISTS stock_price (
    id              NUMERIC NOT NULL AUTO_INCREMENT PRIMARY KEY,
    stock_prices    NUMERIC NOT NULL,
    stock_date_time DATE NOT NULL,
    company_code    NUMERIC NOT NULL
    INDEX(company_code),
    INDEX(stock_date_time)
)engine=InnoDB;