package com.bridgelabz.Day5;

import java.util.Scanner;

public class PowerOf2 {
    static void PowerOf2(int i,int k){
        while (i<=k) {
            System.out.println("Power of 2^" + i + " is: " + (Math.pow(2, i)));
            i = i + 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k,i=1;

        System.out.println("Enter value for Power: ");
        k = sc.nextInt();

        System.out.println("power of 2^"+k+" is: "+(Math.pow(2,k)));
        System.out.println();
        System.out.println("Printing all till Power Value "+k);

        PowerOf2(i,k);
    }
}
