package com.bridgelabz.Day2;

import java.util.Scanner;

public class IntOpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Integer Value a,b,c For Operation:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int opt1 = a + b * c;
        System.out.println("Output1::" + opt1);

        int opt2 = a * b + c;
        System.out.println("Output2::" + opt2);

        int opt3 = c + a / b;
        System.out.println("Output3::" + opt3);

        int opt4 = a % b + c;
        System.out.println("Output4::" + opt4);
    }
}
