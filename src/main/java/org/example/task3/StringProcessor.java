package org.example.task3;

import java.util.HashSet;

public class StringProcessor
{
    // Проверка строки на палиндром
    public boolean isPalindrome(String str) {
        String cleanedStr = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String reversedStr = new StringBuilder(cleanedStr).reverse().toString();
        return cleanedStr.equals(reversedStr);
    }

    // Подсчет количества гласных в строке
    public int countVowels(String str) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (char ch : str.toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }

        return count;
    }

    // Подсчет количества согласных в строке
    public int countConsonants(String str) {
        int count = 0;
        String consonants = "bcdfghjklmnpqrstvwxyz";
        for (char ch : str.toLowerCase().toCharArray()) {
            if (consonants.indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }

    // Подсчет количества вхождений слова в строку
    public int countOccurrences(String str, String word) {
        String[] words = str.split("\\s+");
        int count = 0;
        for (String w : words) {
            if (w.equalsIgnoreCase(word)) {
                count++;
            }
        }
        return count;
    }
}

