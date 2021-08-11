package com.bridgelabz.Day6;

import java.util.Scanner;

import static java.lang.Math.cos;

public class Cos {
    static void calculate_cos(float x){
        float accuracy = (float) 0.0001, denominator, cosx, cosval;
        // Converting degrees to radian
        x = x * (float)(3.142 / 180.0);
        float x1 = x;
        // maps the sum along the series
        cosx = x;
        // holds the actual value of sin(n)
        cosval = (float)cos(x);
        int i = 1;
        do
        {
            denominator = 2 * i * (2 * i + 1);
            x1 = -x1 * x * x / denominator;
            cosx = cosx + x1;
            i = i + 1;
        } while (accuracy <= cosval - cosx);
        System.out.println(cosx);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Angle in Degree : ");
        float x = sc.nextInt();
        calculate_cos(x);
    }
}
