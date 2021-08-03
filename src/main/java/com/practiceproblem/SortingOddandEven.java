package com.practiceproblem;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortingOddandEven {
    static void shortingOddEven(Integer arr[], int n)
    {
        int l = 0, r = n - 1;

        int k = 0;
        while (l < r)
        {
            while (arr[l] % 2 != 0)
            {
                l++;
                k++;
            }

            while (arr[r] % 2 == 0 && l < r)
                r--;

            if (l < r)
            {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
            }
        }
        Arrays.sort(arr, 0, k, Collections.reverseOrder());
        Arrays.sort(arr, k, n);
    }
    public static void main(String[] args)
    {
        System.out.println("Enter the Size of Array:");
        Scanner sc =new Scanner(System.in);
        int length =sc.nextInt();
        Integer arr[] = new Integer[length];
        System.out.println("Enter The Element:");
        for(int i=0; i <length; i++) {
            arr[i] = sc.nextInt();
        }
        shortingOddEven(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
