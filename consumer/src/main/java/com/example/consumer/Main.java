package com.example.consumer;

import com.example.service.currencyExchange;

import java.util.Scanner;
import java.util.ServiceLoader;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ServiceLoader<currencyExchange> loader = ServiceLoader.load(currencyExchange.class);

        System.out.println("Enter amount in SEK to convert:");

        double amountSEK = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Choose currency to convert to:");

        int i = 1;
        for (currencyExchange converter : loader) {
            System.out.println(i + ". " + converter.getCurrencyName());
            i++;
        }

        int choice = scanner.nextInt();
        if (choice > 0 && choice < i) {
            i = 1;
            for (currencyExchange converter : loader) {
                if (i == choice) {
                    double convertedAmount = converter.convert(amountSEK);
                    System.out.println("Converted amount is: " + convertedAmount + " " + converter.getCurrencyName());
                    break;
                }
                i++;
            }
        } else {
            System.out.println("Invalid choice");
            System.exit(1);
        }
    }
}








