package com.tw.apistackbase.controller;

import com.tw.apistackbase.entity.Company;
import com.tw.apistackbase.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/companies")
public class CompanyController {
    @Autowired
    private CompanyService companyService;
    @GetMapping(produces = {"application/json"})
    public Iterable<Company> getCompany() {
        return companyService.getCompany();
    }
    
    @PostMapping(produces = {"application/json"})
    public Company addCompany(@RequestBody Company company) {
        return companyService.addCompany(company);
    }
}
