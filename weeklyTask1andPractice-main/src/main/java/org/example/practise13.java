package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class practise13 {
        public static void main (String[] args){
                int number = -1;
                checkNumber(number);
                System.out.println(checkNumber(number));


        }
        public static String checkNumber (int number){
                if (number > 0){
                        System.out.println("positive");
                }
                else if (number < 0){
                        System.out.println("negative");
                }
                else if (number == 0){
                        System.out.println("zero");
                }

                return null;
        }


}

