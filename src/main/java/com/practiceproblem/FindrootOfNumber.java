package com.practiceproblem;

import java.util.Scanner;

public class FindrootOfNumber {
    static double diff(double n, double mid) {
        if (n > (mid * mid * mid))
            return (n - (mid * mid * mid));
        else return ((mid * mid * mid) - n);
    }
//

    static double cubeRoot(double n) {
        double start = 0, end = n;
        double e = 0.0000001;
        while (true) {
            double mid = (start + end) / 2;
            double error = diff(n, mid);
            if (error <= e)
                return mid;
            if ((mid * mid * mid) > n)
                end = mid;
            else
                start = mid;
        }
    }

    public static void main(String[] args) {
        double n = 8;
        System.out.println("cuberoot of " + n + " is " + cubeRoot(n));
    }
}