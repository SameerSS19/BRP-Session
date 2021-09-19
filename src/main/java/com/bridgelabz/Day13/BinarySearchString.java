package com.bridgelabz.Day13;

import java.util.Scanner;

public class BinarySearchString {
    static int binarySearch(String[] arr, String x)
    {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            int res = x.compareTo(arr[m]);

            // Check if x is present at mid
            if (res == 0)
                return m;

            // If x greater, ignore left half
            if (res > 0)
                l = m + 1;

                // If x is smaller, ignore right half
            else
                r = m - 1;
        }

        return -1;
    }
    // Driver method to test above
    public static void main(String []args)
    {
        String[] arr = { "Avinas","Dnyaneswari","Sameer", "Tushal","Waseem"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name:");
        String x = sc.next();
        int result = binarySearch(arr, x);

        if (result == -1)
            System.out.println("Name not found");
        else
            System.out.println("Name found at "
                    + "index " + result);
    }
}
