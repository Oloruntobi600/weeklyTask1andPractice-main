package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class sumOfMultipleNumbersTest {
    @Test
    void ifLogicSumOfMultipleIsCorrect() {
        var sumOfMultipleNumbers = new sumOfMultipleNumbers();
        int[] array = {10,10,10,10,10};
        assertEquals(50, sumOfMultipleNumbers.sumOfMultiple(array));

    }
    @Test
    void testSumOfNegatives() {
        var sumOfMultipleNumbers = new sumOfMultipleNumbers();
        int[] array = {-10,-10,-10,-10,-10};
        assertEquals(-50, sumOfMultipleNumbers.sumOfMultiple(array));

    }
    @Test
    void testSumOfNegativesWrong() {
        var sumOfMultipleNumbers = new sumOfMultipleNumbers();
        int[] array = {-10,-10,-10,-10,-10};
        assertNotEquals(50, sumOfMultipleNumbers.sumOfMultiple(array));

    }
    @Test
    void ifLogicSumOfMultipleIsNotCorrect() {
        int[] array = {10,10,10,10,10};
        assertNotEquals(70, sumOfMultipleNumbers.sumOfMultiple(array));

    }
}