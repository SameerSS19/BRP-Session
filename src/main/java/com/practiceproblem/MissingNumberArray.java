package com.practiceproblem;

import java.util.Arrays;

public class MissingNumberArray {

    public static int getMissingNumber(int[] arr)
    {
        int n = arr.length;
        int m = n + 1;
        int total = m * (m + 1) / 2;
        //total = 10*(10+1)/2=55
        // return = 54-49=5
        //sum = 1+2+.....10=49
        int sum = Arrays.stream(arr).sum();

        return total - sum;
    }

    public static void main(String[] args)
    {
        int[] arr = { 1, 2, 3, 4, 6, 7, 8, 9, 10};

        System.out.println("The missing number is " + getMissingNumber(arr));
    }
}
