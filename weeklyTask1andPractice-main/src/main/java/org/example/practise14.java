package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class practise14 {
        public static void main (String[] args){
                calFeetAndInchesToCentimeters(6,5 );


        }
        public static double calFeetAndInchesToCentimeters (double feet, double inches){
                if ((feet < 0) || (inches < 0) || (inches > 12)){
                        return -1;
                }
                double centimeters = (feet * 12)*2.54;
                centimeters += inches *2.54;
                System.out.println(feet + "feet," + inches + "inches =" + centimeters + "cm");
                return centimeters;

        }


}

