package com.example.providers;

import com.example.service.currencyExchange;

public class gpdSek implements currencyExchange {

    @Override
    public double convert (double value){
        double result = value * 13.50;
        result = Math.round(result * 100.0)/100.0;
        return result;
    }

    @Override
    public String getCurrencyName(){
        return "GPD";
    }
}
