package com.iiht.estock.stockprices.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Company {

    @Id
    private Long companyCode;
    private String companyName;
    private String companyCEO;
    private String companyTurnOver;
    private String companyWebsite;
    private String stockExchange;
    private BigDecimal latestStockPrice;
}
