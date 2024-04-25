package com.example.providers.consumer;




import java.util.ServiceLoader;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        ServiceLoader<currencyConverter>loader = ServiceLoader.load(currencyConverter.class);


        for (currencyConverter converter : loader) {}
    }
}
