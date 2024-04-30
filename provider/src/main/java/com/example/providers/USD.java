package com.example.providers;

import com.example.service.currencyExchange;

public class USD implements currencyExchange {
    @Override
    public double convert (double value){
        double result = value * 0.091;
        result = Math.round(result * 100.0)/100.0;
        return result;
    }

    @Override
    public String getCurrencyName(){
        return "USD";
    }
}
