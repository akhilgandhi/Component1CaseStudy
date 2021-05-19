package com.iiht.estock.company.repository;

import com.iiht.estock.company.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {

    @Query("select companyCode from Company")
    List<Long> findAllId();
}
