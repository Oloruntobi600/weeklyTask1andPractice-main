package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class gCalculatorTest {
    @Test
    void gradeBetween90And100(){
//        var gCalculator = new gCalculator();
        assertEquals('A',gCalculator.calculatorGrade(90));
        assertEquals('A',gCalculator.calculatorGrade(98));
    }
    @Test
    void gradeBetween80And89(){
//        var gCalculator = new gCalculator();
        assertEquals('B',gCalculator.calculatorGrade(82));
        assertEquals('B',gCalculator.calculatorGrade(89));
    }
    @Test
    void gradeBetween70And79(){
//        var gCalculator = new gCalculator();
        assertEquals('C',gCalculator.calculatorGrade(75));
        assertEquals('C',gCalculator.calculatorGrade(71));
    }@Test
    void gradeBetween60And69(){
//        var gCalculator = new gCalculator();
        assertEquals('D',gCalculator.calculatorGrade(62));
        assertEquals('D',gCalculator.calculatorGrade(68));
    }@Test
    void gradeBetween0And59(){
//        var gCalculator = new gCalculator();
        assertEquals('F',gCalculator.calculatorGrade(20));
        assertEquals('F',gCalculator.calculatorGrade(40));
    }
//    @Test
//    void negativeShouldReturnIllegalArgumentException(){
//        var gCalculator = new gCalculator();
////    assertEquals('F',gCalculator.calculatorGrade(20));
////    assertEquals('F',gCalculator.calculatorGrade(40));
//        assertThrows(IllegalArgumentException.class, () -> {
//            gCalculator.calculatorGrade(-1);
//        });
//
//    }

}