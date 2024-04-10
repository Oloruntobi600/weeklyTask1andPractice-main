package org.example;

import java.sql.SQLOutput;

public class practise1 {
    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("My New Min Float =" + myMinFloatValue);
        System.out.println("My New Max Float =" + myMaxFloatValue);
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("My New Min Double =" + myMinDoubleValue);
        System.out.println("My New Max Double =" + myMaxDoubleValue);

        int myIntValue = 5/2;
        float myFloatValue =  5F/2F;
        double myDoubleValue = 5D/2D;
        System.out.println("My New Integer Value =" + myIntValue);
        System.out.println("My New Float Value =" + myFloatValue);
        System.out.println("My New Double Value =" + myDoubleValue);

        double myNumberOfPounds = 200D;
        double myNewKilogram = myNumberOfPounds * 0.45359237;
        System.out.println("My Converted Pounds =" +myNewKilogram);

    }
}