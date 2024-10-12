package org.example.task4;

public class LengthConverter {

    // Конвертация в миллиметры
    public double toMillimeters(double value, String unit) {
        switch (unit.toLowerCase()) {
            case "cm":
                return value * 10;          // сантиметры в миллиметры
            case "dm":
                return value * 100;         // дециметры в миллиметры
            case "m":
                return value * 1000;        // метры в миллиметры
            case "km":
                return value * 1000000;   // километры в миллиметры
            case "mm":
            default:
                return value;               // миллиметры
        }
    }

    // Конвертация в сантиметры
    public double toCentimeters(double value, String unit) {
        switch (unit.toLowerCase()) {
            case "mm":
                return value / 10;          // миллиметры в сантиметры
            case "dm":
                return value * 10;          // дециметры в сантиметры
            case "m":
                return value * 100;         // метры в сантиметры
            case "km":
                return value * 100000;     // километры в сантиметры
            case "cm":
            default:
                return value;               // сантиметры
        }
    }

    // Конвертация в дециметры
    public double toDecimeters(double value, String unit) {
        switch (unit.toLowerCase()) {
            case "mm":
                return value / 100;         // миллиметры в дециметры
            case "cm":
                return value / 10;          // сантиметры в дециметры
            case "m":
                return value * 10;          // метры в дециметры
            case "km":
                return value * 10000;      // километры в дециметры
            case "dm":
            default:
                return value;               // дециметры
        }
    }

    // Конвертация в метры
    public double toMeters(double value, String unit) {
        switch (unit.toLowerCase()) {
            case "mm":
                return value / 1000;        // миллиметры в метры
            case "cm":
                return value / 100;         // сантиметры в метры
            case "dm":
                return value / 10;          // дециметры в метры
            case "km":
                return value * 1000;        // километры в метры
            case "m":
            default:
                return value;               // метры
        }
    }

    // Конвертация в километры
    public double toKilometers(double value, String unit) {
        switch (unit.toLowerCase()) {
            case "mm":
                return value / 1000000;    // миллиметры в километры
            case "cm":
                return value / 100000;      // сантиметры в километры
            case "dm":
                return value / 10000;       // дециметры в километры
            case "m":
                return value / 1000;         // метры в километры
            case "km":
            default:
                return value;                // километры
        }
    }
}
