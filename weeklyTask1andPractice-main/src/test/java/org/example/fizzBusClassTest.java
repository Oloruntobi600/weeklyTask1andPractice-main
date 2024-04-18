package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class fizzBusClassTest {
    @Test
    public void testFizzBuzzDivisibleBy3And5() {
//        fizzBusClass fizzBusClass = new fizzBusClass();
        assertEquals("FizzBuzz", fizzBusClass.fizzBuzz(15));
        assertEquals("FizzBuzz", fizzBusClass.fizzBuzz(30));
    }
    @Test
    public void testFizzBuzzDivisibleByNegative() {
//        fizzBusClass fizzBusClass = new fizzBusClass();
        assertEquals("FizzBuzz", fizzBusClass.fizzBuzz(-15));
        assertEquals("FizzBuzz", fizzBusClass.fizzBuzz(-30));
    }

    @Test
    public void testFizzBuzzDivisibleBy3() {
        assertEquals("Fizz", fizzBusClass.fizzBuzz(3));
        assertEquals("Fizz", fizzBusClass.fizzBuzz(9));
    } @Test
    public void testFizzBuzzDivisibleByANegative() {
        assertEquals("Fizz", fizzBusClass.fizzBuzz(-3));
        assertEquals("Fizz", fizzBusClass.fizzBuzz(-9));
    }

    @Test
    public void testFizzBuzzDivisibleBy5() {
        assertEquals("Buzz", fizzBusClass.fizzBuzz(5));
        assertEquals("Buzz", fizzBusClass.fizzBuzz(10));
    }
    @Test
    public void testFizzBuzzDivisibleByNegative5() {
        assertEquals("Buzz", fizzBusClass.fizzBuzz(-5));
        assertEquals("Buzz", fizzBusClass.fizzBuzz(-10));
    }

    @Test
    public void testFizzBuzzNotDivisibleBy3Or5() {
        assertEquals("Not accepted", fizzBusClass.fizzBuzz(1));
        assertEquals("Not accepted", fizzBusClass.fizzBuzz(7));
    }
}