package com.iiht.estock.stockprices.service;

import com.iiht.estock.stockprices.model.StockPrice;
import com.iiht.estock.stockprices.repository.StockPriceRepository;
import lombok.SneakyThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

class StockPriceServiceImplTest {

    @InjectMocks
    StockPriceServiceImpl stockPriceService;

    @Mock
    StockPriceRepository stockPriceRepository;

    @BeforeEach
    public void init() {
        MockitoAnnotations.openMocks(this);
    }

    @SneakyThrows
    @Test
    void addStockPrice() {
        StockPrice stockPrice = new StockPrice(1L, BigDecimal.valueOf(581.90), LocalDate.now(), 11111L);
        stockPriceService.addStockPrice(stockPrice);
        verify(stockPriceRepository, times(1)).save(stockPrice);
    }

    @Test
    void getAllStockPricesByCompanyCodeBetweenDates() {
    }
}