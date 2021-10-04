package com.practiceproblem;

import java.util.Scanner;

public class MoveAllZerosatEnd {
    public static void zerosToEnd(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }
        for (int j = count; j < n; j++) {
            arr[count++] = 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Length of Array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter The Array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        zerosToEnd(arr, n);
        for (int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
}
