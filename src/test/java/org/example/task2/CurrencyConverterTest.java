package org.example.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CurrencyConverterTest {

    @Test
    public void testConversionUSDToEUR() {
        CurrencyConverter converter = new CurrencyConverter();
        double result = converter.convert(10, "USD", "EUR");
        Assertions.assertEquals(8.7, result, 0.01);
    }

    @Test
    public void testConversionEURToGBP() {
        CurrencyConverter converter = new CurrencyConverter();
        double result = converter.convert(10, "EUR", "GBP");
        Assertions.assertEquals(8.5057, result, 0.01);
    }

    @Test
    public void testConversionGBPToJPY() {
        CurrencyConverter converter = new CurrencyConverter();
        double result = converter.convert(10, "GBP", "JPY");
        Assertions.assertEquals(1486.49, result, 0.01);
    }

    @Test
    public void testInvalidCurrency() {
        CurrencyConverter converter = new CurrencyConverter();
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            converter.convert(10, "USD", "XYZ");
        });
    }
}
