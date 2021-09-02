package com.bridgelabz.Day9;

import com.bridgelabz.Day9.MathFunction.MathFunction;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number  : ");
        int num = sc.nextInt();
        for (int i = 0; i <= num; i++){
            if (MathFunction.isPrime(i))
                System.out.println(i + " ");
        }
    }
}
