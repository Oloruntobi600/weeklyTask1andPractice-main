package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class practise8 {
    public static void main(String[] args) {

       boolean gameOver = true;
       int score = 800;
       int levelCompleted = 5;
       int bonus = 100;

       if (score < 5000 && score > 1000){
           System.out.println("your score was less than 5000 but greater than 1000");
       }
       else if (score > 1000) {
            System.out.println("your score was less than 1000");
        }
       else {
           System.out.println("got here");
       }

       if (gameOver == true){
        int finalScore = score + (levelCompleted * bonus);
           System.out.println(finalScore);
       }

        }
    }
