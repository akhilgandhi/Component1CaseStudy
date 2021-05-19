package com.iiht.estock.stockprices.model;

import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.List;

@Data
@ToString
public class StockPriceDTO {

    private List<StockPrice> stockPrices;
    private BigDecimal maxStockPrice;
    private BigDecimal minStockPrice;
    private BigDecimal avgStockPrice;
}
