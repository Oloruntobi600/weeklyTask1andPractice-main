package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int myValue = 1000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("My Integer Min Value=" + myMinIntValue);
        System.out.println("My Integer Max Value=" + myMaxIntValue);
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("My Byte Min Value=" + myMinByteValue);
        System.out.println("My Byte Max Value=" + myMaxByteValue);
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("My Short Min Value=" + myMinShortValue);
        System.out.println("My Short Max Value=" + myMaxShortValue);
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("My Long Min Value=" + myMinLongValue);
        System.out.println("My Long Max Value=" + myMaxLongValue);

        int myTotal = (myMinIntValue/2);
        byte myNewMinByteValue = (byte) (myMinByteValue/2);
        short myNewMinShortValue = (short) (myMinShortValue/2);
        long myNewMinLongValue = (long) (myMinLongValue/2);
        byte myNewByte =10;
        short myNewShort = 20;
        int myNewInt = 50;
        long myNewLong = (long) (50000+(10*(myNewByte + myNewShort + myNewInt)));
        System.out.println(myNewLong);
    }
}
