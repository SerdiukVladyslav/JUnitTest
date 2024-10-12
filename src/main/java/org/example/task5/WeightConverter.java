package org.example.task5;

public class WeightConverter
{
    // Конвертация в миллиграммы
    public double toMilligrams(double value, String unit) {
        switch (unit.toLowerCase()) {
            case "g":
                return value * 1000;          // граммы в миллиграммы
            case "kg":
                return value * 1000000;       // килограммы в миллиграммы
            case "q":
                return value * 100000;         // центнеры в миллиграммы
            case "t":
                return value * 1000000000;     // тонны в миллиграммы
            case "mg":
            default:
                return value;                  // миллиграммы
        }
    }

    // Конвертация в граммы
    public double toGrams(double value, String unit) {
        switch (unit.toLowerCase()) {
            case "mg":
                return value / 1000;          // миллиграммы в граммы
            case "kg":
                return value * 1000;          // килограммы в граммы
            case "q":
                return value * 100000;         // центнеры в граммы
            case "t":
                return value * 1000000;       // тонны в граммы
            case "g":
            default:
                return value;                  // граммы
        }
    }

    // Конвертация в килограммы
    public double toKilograms(double value, String unit) {
        switch (unit.toLowerCase()) {
            case "mg":
                return value / 1000000;        // миллиграммы в килограммы
            case "g":
                return value / 1000;           // граммы в килограммы
            case "q":
                return value * 100;            // центнеры в килограммы
            case "t":
                return value * 1000;           // тонны в килограммы
            case "kg":
            default:
                return value;                  // килограммы
        }
    }

    // Конвертация в центнеры
    public double toQuintals(double value, String unit) {
        switch (unit.toLowerCase()) {
            case "mg":
                return value / 100000000;         // миллиграммы в центнеры
            case "g":
                return value / 100000;         // граммы в центнеры
            case "kg":
                return value / 100;            // килограммы в центнеры
            case "t":
                return value * 10;             // тонны в центнеры
            case "q":
            default:
                return value;                  // центнеры
        }
    }

    // Конвертация в тонны
    public double toTons(double value, String unit) {
        switch (unit.toLowerCase()) {
            case "mg":
                return value / 1000000000;     // миллиграммы в тонны
            case "g":
                return value / 1000000;        // граммы в тонны
            case "kg":
                return value / 1000;           // килограммы в тонны
            case "q":
                return value / 10;             // центнеры в тонны
            case "t":
            default:
                return value;                  // тонны
        }
    }
}
