package com.bridgelabz.Day9;

import com.bridgelabz.Day9.MathFunction.MathFunction;

import java.util.Scanner;

public class Sqrt {
    public static void main(String[] args) {
        MathFunction mathFunction = new MathFunction();
        Scanner sc = new Scanner(System.in);
        int num;
        double result;
        System.out.println("Enter the value : ");
        num = sc.nextInt();
        if (num > 0){
            result = mathFunction.squareRootUsingNewtonMethod(num);
            System.out.println("Square Root of " + num + " using Newtons Law is " + result);
        }
        else
            System.out.println("Enter Positive Number : ");
    }
}
