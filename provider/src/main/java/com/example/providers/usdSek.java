package com.example.providers;

import com.example.service.currencyExchange;

public class dollarSek implements currencyExchange {
    @Override
    public double convert (double value){
        return value * 10.89;
    }

    @Override
    public String getCurrencyName(){
        return "Dollar";
    }
}
