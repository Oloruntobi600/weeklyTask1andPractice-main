package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class sumOfMultipleNumbers {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4,9};
        int sum = sumOfMultiple (array);
        System.out.println(sum);
    }
    public static int sumOfMultiple(int[] array){
        // why is the sum set to zero and not one????
        // when you set to zero, the zero won't be included in the sum
        int sum = 0;
        // for (int i = 9; i>=1; i++){}
        // where i = number
        // trying to loop through the numbers in the array. i.e numbers in the array
        for (int num : array) {

            sum += num;
        }
        return sum;
        }
}

