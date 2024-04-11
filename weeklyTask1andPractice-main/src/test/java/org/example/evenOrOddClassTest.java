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

}