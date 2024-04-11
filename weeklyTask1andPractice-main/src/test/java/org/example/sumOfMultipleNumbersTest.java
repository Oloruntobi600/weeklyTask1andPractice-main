package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class sumOfMultipleNumbersTest {
    @Test
    void ifLogicSumOfMultipleIsCorrect() {
        int[] array = {10,10,10,10,10};
        assertEquals(50, sumOfMultipleNumbers.sumOfMultiple(array));

    }
    @Test
    void ifLogicSumOfMultipleIsNotCorrect() {
        int[] array = {10,10,10,10,10};
        assertNotEquals(70, sumOfMultipleNumbers.sumOfMultiple(array));

    }
}