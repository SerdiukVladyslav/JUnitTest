package org.example.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringProcessorTest
{
    @Test
    public void testIsPalindrome() {
        StringProcessor processor = new StringProcessor();
        Assertions.assertTrue(processor.isPalindrome("A man a plan a canal Panama"));
        Assertions.assertFalse(processor.isPalindrome("Hello World"));
    }

    @Test
    public void testCountVowels() {
        StringProcessor processor = new StringProcessor();
        Assertions.assertEquals(3, processor.countVowels("Hello World"));
        Assertions.assertEquals(8, processor.countVowels("A beautiful morning"));
    }

    @Test
    public void testCountConsonants() {
        StringProcessor processor = new StringProcessor();
        Assertions.assertEquals(7, processor.countConsonants("Hello World"));
        Assertions.assertEquals(9, processor.countConsonants("A beautiful morning"));
    }

    @Test
    public void testCountOccurrences() {
        StringProcessor processor = new StringProcessor();
        Assertions.assertEquals(2, processor.countOccurrences("Hello World World", "World"));
        Assertions.assertEquals(0, processor.countOccurrences("Hello World", "Universe"));
    }
}
