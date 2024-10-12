package org.example.task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LengthConverterTest {

    private final LengthConverter converter = new LengthConverter();

    @Test
    public void testToMillimeters() {
        Assertions.assertEquals(1000, converter.toMillimeters(1, "m"));
        Assertions.assertEquals(100, converter.toMillimeters(10, "cm"));
        Assertions.assertEquals(100, converter.toMillimeters(1, "dm"));
        Assertions.assertEquals(1000000, converter.toMillimeters(1, "km"));
        Assertions.assertEquals(1, converter.toMillimeters(1, "mm"));
    }

    @Test
    public void testToCentimeters() {
        Assertions.assertEquals(100, converter.toCentimeters(1, "m"));
        Assertions.assertEquals(10, converter.toCentimeters(1, "dm"));
        Assertions.assertEquals(1, converter.toCentimeters(10, "mm"));
        Assertions.assertEquals(100000, converter.toCentimeters(1, "km"), 0.0001);
        Assertions.assertEquals(1, converter.toCentimeters(1, "cm"));
    }

    @Test
    public void testToDecimeters() {
        Assertions.assertEquals(10, converter.toDecimeters(1, "m"));
        Assertions.assertEquals(1, converter.toDecimeters(10, "cm"));
        Assertions.assertEquals(0.01, converter.toDecimeters(1, "mm"));
        Assertions.assertEquals(10000, converter.toDecimeters(1, "km"), 0.0001);
        Assertions.assertEquals(1, converter.toDecimeters(1, "dm"));
    }

    @Test
    public void testToMeters() {
        Assertions.assertEquals(1, converter.toMeters(1000, "mm"));
        Assertions.assertEquals(0.01, converter.toMeters(1, "cm"), 0.0001);
        Assertions.assertEquals(0.1, converter.toMeters(1, "dm"), 0.0001);
        Assertions.assertEquals(1000, converter.toMeters(1, "km"), 0.0001);
        Assertions.assertEquals(1, converter.toMeters(1, "m"));
    }

    @Test
    public void testToKilometers() {
        Assertions.assertEquals(0.000001, converter.toKilometers(1, "mm"), 0.0001);
        Assertions.assertEquals(0.00001, converter.toKilometers(1, "cm"), 0.0001);
        Assertions.assertEquals(0.0001, converter.toKilometers(1, "dm"), 0.0001);
        Assertions.assertEquals(0.001, converter.toKilometers(1, "m"));
        Assertions.assertEquals(1, converter.toKilometers(1, "km"));
    }
}
