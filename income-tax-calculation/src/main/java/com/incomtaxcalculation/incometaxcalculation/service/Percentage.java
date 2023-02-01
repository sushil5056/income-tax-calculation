package com.incomtaxcalculation.incometaxcalculation.service;

import org.springframework.stereotype.Service;

@Service
public class Percentage {


    public int getPercentage(int ctc){
        int percentage=0;

        if(600000<ctc && ctc<=900000){
            percentage=10;
        } else if (900000<ctc && ctc<=1200000) {
            percentage=15;
        }
        else if (1200000<ctc && ctc<=1500000) {
            percentage=20;
        }
        else{
            percentage=30;
        }
        return percentage;
    }
}
