package com.incomtaxcalculation.incometaxcalculation.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaxCalculationTaxService {

        @Autowired
        Percentage percentage;
    public Integer getotaltaxPayble(int ctc) {

        int TaxPaybaleAmount=0;
        int totalTaxPaybaleAmount=0;

        if(ctc<=700000){
            totalTaxPaybaleAmount=0;

        }else {

            Integer pctage=percentage.getPercentage(ctc);

            15000+  percentage.getPercentage(ctc);
        }
        return totalTaxPaybaleAmount;
    }
}
