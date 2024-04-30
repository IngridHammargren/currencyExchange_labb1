package com.example.providers;

import com.example.service.currencyExchange;

public class GBP implements currencyExchange {

    @Override
    public double convert (double value){
        double result = value * 0.074;
        result = Math.round(result * 100.0)/100.0;
        return result;
    }

    @Override
    public String getCurrencyName(){
        return "GBP";
    }
}
