package com.bridgelabz.Day8;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayStringEqual {
    public static void main (String[] args)
    {
        //defining array to compare
        // array1 have  element
        // array2 also have element
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First String : ");
        String arr1 = sc.nextLine();
        Object[] array1 = {arr1};
        System.out.println("Enter the second String : ");
        String arr2 = sc.nextLine();
        Object[] array2 = {arr2};

        //comparing two arrays using equals() method
        if (Arrays.deepEquals(array1, array2))
            System.out.println("Arrays are Equal.");
        else
            System.out.println("Arrays are not Equal.");
    }
}

