package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class practise9 {
    public static void main(String[] args) {
        boolean newGame = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;

        if (score >1000 && score < 2000){
            System.out.println("your score is greater than 1000 and less than 2000");
        }
        else if (score <1000 && score >2000){
            System.out.println("your score is less thsn 1000 and greater than 2000!");
        }
        else if (score > 2000){
            System.out.println("your score is greater than 2000!");
        }
        else {
            System.out.println("your score is game over");
        }
        if (newGame ==true){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println(finalScore);
        }
        }
    }
