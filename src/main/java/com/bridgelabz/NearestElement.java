package com.bridgelabz;
import java.util.Arrays;
import java.util.Scanner;

public class NearestElement {
    static void closestSquare(int[] arr, int N)
    {
        for(int i = 0; i < N; i++)
        {

            int sr = (int)Math.sqrt(arr[i]);

            int a = sr * sr;
            int b = (sr + 1) * (sr + 1);

            if ((arr[i] - a) < (b - arr[i]))
               System.out.print(a + " ");
            else
               System.out.print(b + " ");
        }
    }
    public static void main(String[] args)
    {
        System.out.println("Enter the Size of Array:");
        Scanner sc =new Scanner(System.in);
        int length =sc.nextInt();
        int arr[] = new int [length];
        System.out.println("Enter The Element:");
        for(int i=0; i <length; i++) {
            arr[i] = sc.nextInt();
        }
        int N = arr.length;
       System.out.println("The given Closest Element are :");
       closestSquare(arr, N);
    }

}
