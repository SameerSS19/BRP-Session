package com.bridgelabz.Day10;

public class MathFunction {
    /*
    * compound interest rate r,cash is C,time period is T
    * using formula C/(1 + r)^T.
    * presentValue that computes the amount of money
    */
    public static void presentValue(double presentAmount) {
        System.out.println("Your Present Value is : "+presentAmount);
    }

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
}
