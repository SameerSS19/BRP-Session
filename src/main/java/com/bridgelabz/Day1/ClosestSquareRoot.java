package com.bridgelabz.Day1;

import java.util.Scanner;

public class ClosestSquareRoot {

    public static void main(String args[]) {

        System.out.println("Enter the number here: ");
        double x;
        Scanner sc = new Scanner(System.in);
        x = Integer.valueOf(sc.nextLine());
            if (Math.floor(Math.sqrt(x)) == Math.ceil(Math.sqrt(x))) ;
            else {
                double x1 = Math.floor(Math.sqrt(x)) * Math.floor(Math.sqrt(x));
                double x2 = Math.ceil(Math.sqrt(x)) * Math.ceil(Math.sqrt(x));
                if (Math.abs((x - x1)) > Math.abs(x - x2)) {
                    System.out.println(("The closest perfect square is: " + x2));
                } else {
                    System.out.println(("The closest perfect square is: " + x1));
                }
            }

    }
}