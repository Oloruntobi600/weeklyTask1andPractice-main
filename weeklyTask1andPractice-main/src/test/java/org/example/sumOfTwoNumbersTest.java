package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class sumOfTwoNumbersTest {
    @Test
    void ifTwoNumbersAddCorrectly(){
        var sumOfTwoNumbers = new sumOfTwoNumbersTest();
        assertEquals(25, 10,15);
        assertEquals(5, 3,2);
    }
    @Test
    void ifTwoNumbersDoNotAddCorrectly(){
        var sumOfTwoNumbers = new sumOfTwoNumbersTest();
        assertNotEquals(30, 10,15);
        assertNotEquals(16, 3,2);
    }

}