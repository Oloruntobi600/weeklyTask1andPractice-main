package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class practise5 {
    public static void main(String[] args) {
        int topScore = 80;
        if (topScore < 100) {
            System.out.println("you get a high score!");
        }
        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100!");
        }
        if ((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("Either or both of the conditions are true!");
        }
    }
}
