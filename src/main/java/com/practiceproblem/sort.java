package com.practiceproblem;

import java.util.Scanner;

public class sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int i, j, temp, size;
        size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the Element of the array:");
        for (i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
//        System.out.println("\nEnter the choose Element of the array:");
//        arr[size]=sc.nextInt();

        for (i = 0; i < size; i++) {
            for (j = i + 1; j < size; j++) {
                if (arr[i] <= arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("\nAfter Decreasing order sort Array Elements are:");
        for (i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}