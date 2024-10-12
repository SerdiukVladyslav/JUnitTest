package org.example.task2;

import java.util.HashMap;
import java.util.Map;

public class CurrencyConverter {
    private static final Map<String, Double> exchangeRates = new HashMap<>();

    static {
        // Курсы обмена по отношению к доллару США
        exchangeRates.put("USD", 1.0);    // Доллар
        exchangeRates.put("EUR", 0.87);   // Евро
        exchangeRates.put("GBP", 0.74);   // Фунт стерлингов
        exchangeRates.put("JPY", 110.0);  // Йена
    }

    public double convert(double amount, String fromCurrency, String toCurrency) {
        if (!exchangeRates.containsKey(fromCurrency) || !exchangeRates.containsKey(toCurrency)) {
            throw new IllegalArgumentException("Некорректная валюта.");
        }

        double rateFromUSD = amount / exchangeRates.get(fromCurrency);
        return rateFromUSD * exchangeRates.get(toCurrency);
    }
}
