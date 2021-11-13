package com.practiceproblem;

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = scanner.nextInt();
        int arrr[] = new int[n];
        System.out.println("Enter the number");
        for (int i = 0;i<n;i++){
            arrr[i]= scanner.nextInt();
        }
        int sum = (n+1)*(n+2)/2;
        for (int i = 0;i<n;i++){
            sum = sum-arrr[i];
        }
        System.out.println("missing number "+ sum);

    }
}
