package com.bridgelabz.Day10;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMinString {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String[] array = new String[5];
        System.out.println("Enter the String like Names");
        for (int i = 0;i < array.length;i++)
        {
            array[i] =sc.nextLine();
        }
        System.out.println(Arrays.toString(array));
        MathFunction.MaxMinString(array);
    }

}
