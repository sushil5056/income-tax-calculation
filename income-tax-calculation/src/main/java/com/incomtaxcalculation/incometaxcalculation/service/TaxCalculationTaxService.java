package com.incomtaxcalculation.incometaxcalculation.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaxCalculationTaxService {

        @Autowired
        Percentage percentage;
    public Integer getotaltaxPayble(int ctc) {

        int totalTaxPaybaleAmount=0;
       int TaxPaybaleAmount=0;
        if(ctc<=700000){
            totalTaxPaybaleAmount=0;

        }else {

            Integer pctage=percentage.getPercentage(ctc);

            if(600000<ctc && ctc<=900000){

                TaxPaybaleAmount= 15000+(ctc-600000)*pctage/100;
            } else if (900000<ctc && ctc<=1200000) {
                TaxPaybaleAmount= 15000+30000+(ctc-900000)*pctage/100;
            }
            else if (1200000<ctc && ctc<=1500000) {
                TaxPaybaleAmount= 15000+30000+45000+(ctc-1200000)*pctage/100;
            }
            else{
                TaxPaybaleAmount= 15000+30000+45000+60000+(ctc-1500000)*pctage/100;
            }

            totalTaxPaybaleAmount=TaxPaybaleAmount+TaxPaybaleAmount*4/100;
        }
        return totalTaxPaybaleAmount;
    }
}
