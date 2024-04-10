package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class sumOfTwoNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
//        let introduced variable = sum
        int sum = sumOfTwo(a, b);
        System.out.println("sum of a and b = " + sum);

        }
    public static int sumOfTwo(int a, int b){
        return a+b;
        }
    }
