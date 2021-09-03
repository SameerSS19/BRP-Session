package com.bridgelabz.Day10;

import java.util.Scanner;

public class PresentCompoundIntrest {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Present Value: ");

        int C=sc.nextInt();

        System.out.println("Enter the Interest Rate: ");

        int r=sc.nextInt();

        System.out.println("Enter the time period in years: ");

        int T=sc.nextInt();
        double presentAmount = C / (1 + r )^T;
        MathFunction.presentValue(presentAmount);


    }
}
