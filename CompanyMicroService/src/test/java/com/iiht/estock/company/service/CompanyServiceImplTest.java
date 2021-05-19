package com.iiht.estock.company.service;

import com.iiht.estock.company.model.Company;
import com.iiht.estock.company.repository.CompanyRepository;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

class CompanyServiceImplTest {

    @InjectMocks
    CompanyServiceImpl companyService;

    @Mock
    CompanyRepository companyRepository;

    @BeforeEach
    public void init() {
        MockitoAnnotations.openMocks(this);
    }

    @SneakyThrows
    @Test
    void addCompany() {
        Company company = new Company(11111L, "XYZ Corp", "Mr. ABC",
                BigDecimal.valueOf(100000001L), "www.xyz.com", "NSE",
                BigDecimal.valueOf(0.00));
        companyService.addCompany(company);
        verify(companyRepository, times(1)).save(company);
    }

    @SneakyThrows
    @Test
    void getCompany() {
        when(companyRepository.findById(11111L)).thenReturn(
                java.util.Optional.of(new Company(11111L, "XYZ Corp", "Mr. ABC",
                BigDecimal.valueOf(100000001L), "www.xyz.com", "NSE",
                BigDecimal.valueOf(0.00))));

        Company getCompany = companyService.getCompany(11111L);

        Assertions.assertEquals("XYZ Corp", getCompany.getCompanyName());
    }
}