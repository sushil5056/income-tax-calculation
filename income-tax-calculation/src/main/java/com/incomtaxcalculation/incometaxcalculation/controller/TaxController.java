package com.incomtaxcalculation.incometaxcalculation.controller;


import com.incomtaxcalculation.incometaxcalculation.service.TaxCalculationTaxService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaxController {
    @Autowired
    TaxCalculationTaxService taxCalculationTaxService;

    @GetMapping("/api/taxDeduction/{ctc}")
    public Integer getTotalTaxDeduction(@PathVariable int ctc){

        return taxCalculationTaxService.getotaltaxPayble(ctc);
    }
}
