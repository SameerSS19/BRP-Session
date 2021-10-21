package com.practiceproblem;

import java.util.Scanner;

public class EvenOddWithoutMod {
    static int even(int n){

        return (n & 1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = sc.nextInt();
        if (even(n) == 0)
            System.out.println("Even");
        else
            System.out.println("odd");
    }
}
