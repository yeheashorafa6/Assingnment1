package com.example.assingmnent1pro;

public class CurrencyConverter {
    private double exchangeRate = 3.5;

    public double convertToShekels(double dollars) {
        return dollars * exchangeRate;
    }

    public double convertToDollars(double shekels) {
        return shekels / exchangeRate;
    }
}
