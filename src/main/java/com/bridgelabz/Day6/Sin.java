package com.bridgelabz.Day6;

import java.util.Scanner;

import static java.lang.StrictMath.sin;

public class Sin {
    static void calculate_sin(float x)
    {
        float accuracy = (float) 0.0001, denominator, sinx, sinval;
        // Converting degrees to radian
        x = x * (float)(3.142 / 180.0);
        float x1 = x;
        // maps the sum along the series
        sinx = x;
        // holds the actual value of sin(n)
        sinval = (float)sin(x);
        int i = 1;
        do
        {
            denominator = 2 * i * (2 * i + 1);
            x1 = -x1 * x * x / denominator;
            sinx = sinx + x1;
            i = i + 1;
        } while (accuracy <= sinval - sinx);
        System.out.println(sinx);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Angle in Degree : ");
        float x = sc.nextInt();
        calculate_sin(x);
    }
}
