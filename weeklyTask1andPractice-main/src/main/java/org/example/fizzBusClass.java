package org.example;

import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class fizzBusClass {
    public static void main (String[] args) {
        int n =17;
//        fizzBuzz(n);
        System.out.println(fizzBuzz(n));
    }
    public static String fizzBuzz(int n){
        if (n % 3==0 && n % 5==0){
            return "FizzBuzz";
        }
        else if (n % 3 == 0){
            return "Fizz";
        }
        else if (n % 5 == 0){
            return "Buzz";
        }

        return "Not accepted";
    }
}
