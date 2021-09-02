package com.bridgelabz.Day9;

import com.bridgelabz.Day9.MathFunction.MathFunction;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        a. To return an harmonic number
         */
        System.out.println("Enter Number for Harmonic Series");
        int num = sc.nextInt();
        System.out.println("H" +num+ " = ");
        MathFunction.harmonicSeries(num);
        System.out.println();
        /*
        b. To return a sin of an angle
         */
        System.out.println(" ");
        System.out.println("Enter Sin Angle : ");
        double sin = sc.nextInt();
        MathFunction.isSin(sin);
        /*
        c. To return cosine of an angle
         */
        System.out.println(" ");
        System.out.println("Enter Cos Angle : ");
        double cosine = sc.nextInt();
        MathFunction.isCosine(cosine);
        /*
        d. To return Binary of a number
         */
        System.out.println(" ");
        System.out.println("Enter Decimal Number : ");
        int decimal = sc.nextInt();
        MathFunction.Binary(decimal);
    }
}
