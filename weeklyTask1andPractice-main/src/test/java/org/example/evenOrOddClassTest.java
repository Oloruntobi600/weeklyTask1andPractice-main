package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class evenOrOddClassTest {
    @Test
    void itIsEvenOrOdd(){
        var evenOrOdd = new evenOrOddClass();
        assertEquals("Even",evenOrOdd.evenOrOdd(4));
        assertEquals("Odd",evenOrOdd.evenOrOdd(5));
    }
    @Test
    void itIsEvenOrOddWrong(){
        var evenOrOdd = new evenOrOddClass();
        assertNotEquals("Odd",evenOrOdd.evenOrOdd(4));
        assertNotEquals("Even",evenOrOdd.evenOrOdd(5));
    }
    @Test
    void testIfNegativeNumberIsEven(){
        var evenOrOdd = new evenOrOddClass();
        assertEquals("Even",evenOrOdd.evenOrOdd(-4));
        assertEquals("Even",evenOrOdd.evenOrOdd(-10));
    }
    @Test
    void testIfNegativeNumberIsOdd(){
        var evenOrOdd = new evenOrOddClass();
        assertEquals("Odd",evenOrOdd.evenOrOdd(3));
        assertEquals("Odd",evenOrOdd.evenOrOdd(5));
    }

}