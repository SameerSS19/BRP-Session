package com.practiceproblem;

import java.util.Arrays;

public class KthSmallestElement {
    public static int kthSmallest(Integer[] arr,
                                  int k)
    {
        // Sort the given array
        Arrays.sort(arr);

        // Return k'th element in
        // the sorted array
        return arr[k - 1];
    }

    // driver program
    public static void main(String[] args)
    {
        Integer arr[] = new Integer[] { 12, 3, 5, 7, 19 };
        int k = 2;
        System.out.print("K'th smallest element is " + kthSmallest(arr, k));
    }
}

