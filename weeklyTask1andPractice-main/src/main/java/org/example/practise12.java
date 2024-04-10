package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class practise12 {
    public static void main(String[] args) {
        checkNumber(5);
        checkNumber(-10);


    }

    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("positive");
        }
        else if (number < 0) {
            System.out.println("negetive");
        }
        else if (number == 0) {
            System.out.println("zero");
        }
    }
}
