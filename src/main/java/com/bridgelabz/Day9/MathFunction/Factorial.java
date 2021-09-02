package com.bridgelabz.Day9.MathFunction;

import java.util.Scanner;

import static com.bridgelabz.Day9.MathFunction.MathFunction.factorial;

public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number  : ");
        int n = sc.nextInt();
        long factorial=factorial(n);
        System.out.println("Factorial of entered number is: "+factorial);
        factorial(n);
    }
}
