package com.bridgelabz.Day2;

import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Integer Value a,b,c For Operation:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c =sc.nextDouble();

        double opt1 = a + b * c;
        System.out.println("Output1::" + opt1);

        double opt2 = a * b + c;
        System.out.println("Output2::" + opt2);

        double opt3 = c + a / b;
        System.out.println("Output3::" + opt3);

        double opt4 = a % b + c;
        System.out.println("Output4::" + opt4);
    }
}
