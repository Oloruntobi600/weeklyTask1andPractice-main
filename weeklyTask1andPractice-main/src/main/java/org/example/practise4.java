package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class practise4 {
    public static void main(String[] args) {
        int result = 1 + 2; //1+2=3
        System.out.println("1+2 =" + result);
        int previousResult = result;
        System.out.println("Previous Result = " + previousResult);
        result = result - 1;
        System.out.println("My new result = " + result);

        result = result * 10;
        System.out.println(result);
        result = result / 5;
        System.out.println(result);
        result = result % 3;
        System.out.println(result);
        result++;
        System.out.println(result);
        result--;
        System.out.println(result);
        result += 2;
        System.out.println(result);
        result *= 10;
        System.out.println(result);
        result /= 3;
        System.out.println(result);
        result -= 2;
        System.out.println(result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien");
            System.out.println("I am not scared of alien");
        }
        int topScore = 100;
        if (topScore == 100){
            System.out.println("you get the high score!");
        }

    }
}

