package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class reverseAString {
    public static void main(String[] args) {
        calculateScore(true, 10000, 8, 200);
        calculateScore(true, 800, 5, 100);


        }
    public static void calculateScore(boolean newGame, int score, int levelCompleted, int bonus){
        if (newGame ==true){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println(finalScore);
        }
    }
}
