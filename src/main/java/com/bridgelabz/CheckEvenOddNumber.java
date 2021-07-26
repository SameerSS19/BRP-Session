package com.bridgelabz;

import java.util.Scanner;

public class CheckEvenOddNumber {

        public static void main(String[] args){
            int num;
            System.out.println("Enter the number: ");
            //Creating a scanner class
            Scanner sc = new Scanner(System.in);
            num = sc.nextInt();
            // if number is divisible by 2 it is a even number.
            // number is not divisible by 2 is a odd number
            if (num % 2 == 0)
                System.out.println("Enter the Number is even: " + num);
            else
                System.out.println("Enter the Number is odd: "+num);
        }


}
