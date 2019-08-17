package com.tw.apistackbase.repository;

import com.tw.apistackbase.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company,Long> {
}
