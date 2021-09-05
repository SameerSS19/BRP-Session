package com.bridgelabz.Day10;

import java.util.Arrays;

public class MathFunction {
    /*
    * compound interest rate r,cash is C,time period is T
    * using formula C/(1 + r)^T.
    * presentValue that computes the amount of money
    */
    public static void presentValue(double presentAmount) {
        System.out.println("Your Present Value is : "+presentAmount);
    }

    /*
     * static method getMax,getMin
     * a minValue to return and maxValue to return max
     * array of integer values given in a parameter
     */
    // Method for getting the maximum value
    public static int getMax(int[] inputArray){
        int maxValue = inputArray[0];
        for(int i=1;i < inputArray.length;i++){
            if(inputArray[i] > maxValue){
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }

    // Method for getting the minimum value
    public static int getMin(int[] inputArray){
        int minValue = inputArray[0];
        for(int i=1;i<inputArray.length;i++){
            if(inputArray[i] < minValue){
                minValue = inputArray[i];
            }
        }
        return minValue;
    }

    /*
     * static method
     * a minValue to return and maxValue to return max
     * array of String values given in a parameter
     * sorting an array.
     * and Print sort array
     */

    public static String MaxMinString(String[] array)
    {

        System.out.println("Sorted Array");
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Max String = " + array[array.length-1]);
        System.out.println("Min String = " + array[0]);
        return "";
    }

    /*
     * static methods
     * checkCollinearUsingSlope & checkCollinearUsingArea to
     * take x1, y1, x2, y2, x3, y3
     * Calculating the area of triangle
     * and check that 3 points are Collinear or not

     */

    public static String Collinear(int x1,int x2,int x3,int y1,int y2,int y3){
        int a = x1 * (y2 - y3) + x2 * (y3 - y1) + x3*(y1 -y2);
        if (a==0)
            System.out.println("Yes points are Collinear");
        else
            System.out.println("No points are not Collinear");
        return "";
    }
}
