package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class gCalculator {
    public static void main(String[] args) {
        int score = (-1);
//        calculatorGrade(score);
        System.out.println(calculatorGrade(score));

        }
    public static char calculatorGrade(int score){
        if (score >=90 && score <=100){
            return 'A';
        }
        else if (score >=80 && score <=89){
            return 'B';
        }
        else if (score >=70 && score <=79){
            return 'C';
        }
        else if (score >=60 && score <=69){
            return 'D';
        }
        else if (score >= 0 && score <=59){
            return 'F';
        }
        return 'z';
    }
}
