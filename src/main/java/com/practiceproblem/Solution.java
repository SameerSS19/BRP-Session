package com.practiceproblem;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        int array[] = new int [5];
        int array1[] = new int [5];
        int i, temp;

        for (i=0; i<5; i++) {
            System.out.printf("Enter array[%d]: \n", i);
            array[i] = input.nextInt(); //Taking input in the array
        }

        System.out.println("\nEntered datas are: \n");
        for (i=0; i<5; i++) {
            System.out.printf("array[%d] = %d\n", i, array[i]); //This will show the data you entered (Not the shifting one)
        }

        temp = array[4]; //We declared the variable "temp" and put the last number of the array there...

        System.out.println("\nAfter Shifting: \n");

        for(i=3; i>=0; i--) {
            array1[i+1] = array[i]; //New array is "array1" & Old array is "array". When array[4] then the value of array[3] will be assigned in it and this goes on..
            array1[0] = temp; //Finally the value of last array which was assigned in temp goes to the first of the new array
        }


        for (i=0; i<5; i++) {
            System.out.printf("array[%d] = %d\n", i, array1[i]);
        }

        input.close();

    }

}
