package org.example.task5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WeightConverterTest {

    private final WeightConverter converter = new WeightConverter();

    @Test
    public void testToMilligrams() {
        Assertions.assertEquals(1000000, converter.toMilligrams(1, "kg"));
        Assertions.assertEquals(1000, converter.toMilligrams(1, "g"));
        Assertions.assertEquals(100000, converter.toMilligrams(1, "q"));
        Assertions.assertEquals(1000000000, converter.toMilligrams(1, "t"));
        Assertions.assertEquals(1, converter.toMilligrams(1, "mg"));
    }

    @Test
    public void testToGrams() {
        Assertions.assertEquals(1000, converter.toGrams(1, "kg"));
        Assertions.assertEquals(1, converter.toGrams(1000, "mg"));
        Assertions.assertEquals(100000, converter.toGrams(1, "q"));
        Assertions.assertEquals(1000000, converter.toGrams(1, "t"));
        Assertions.assertEquals(1, converter.toGrams(1, "g"));
    }

    @Test
    public void testToKilograms() {
        Assertions.assertEquals(1, converter.toKilograms(1000, "g"));
        Assertions.assertEquals(0.000001, converter.toKilograms(1, "mg"), 0.000001);
        Assertions.assertEquals(10000, converter.toKilograms(100, "q"));
        Assertions.assertEquals(1000, converter.toKilograms(1, "t"));
        Assertions.assertEquals(1, converter.toKilograms(1, "kg"));
    }

    @Test
    public void testToQuintals() {
        Assertions.assertEquals(10, converter.toQuintals(1000, "kg"));
        Assertions.assertEquals(0.0000001, converter.toQuintals(1, "mg"), 0.000001);
        Assertions.assertEquals(1, converter.toQuintals(100000, "g"));
        Assertions.assertEquals(10, converter.toQuintals(1, "t"), 0.000001);
        Assertions.assertEquals(1, converter.toQuintals(1, "q"));
    }

    @Test
    public void testToTons() {
        Assertions.assertEquals(1, converter.toTons(1000, "kg"), 0.000001);
        Assertions.assertEquals(0.000000001, converter.toTons(1, "mg"), 0.0000001);
        Assertions.assertEquals(0.1, converter.toTons(1, "q"), 0.000001);
        Assertions.assertEquals(1, converter.toTons(1, "t"));
    }
}
