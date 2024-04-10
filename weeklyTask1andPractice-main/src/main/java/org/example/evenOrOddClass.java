package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class evenOrOddClass {
    public static void main(String[] args) {
        int number = 100;
//        evenOrOdd(number);
        System.out.println(evenOrOdd(number));
    }
    public static String evenOrOdd(int number){
        if (number % 2 == 0){
            return "Even";
        }
        return "Odd";

    }

}
