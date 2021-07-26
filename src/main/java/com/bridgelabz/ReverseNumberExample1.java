package com.bridgelabz;
import java.util.Scanner;
public class ReverseNumberExample1 {
//    public static void main(String[] args)
//    {
//        int number = 23456,reverse =0;
////        while (number!=0)
////        {
////            int remainder = number%10;
////            reverse = reverse*10 + remainder;
////            number=number/10;
////        }
//        for (;number!=0;number=number/10)
//        {
//            int remainder = number%10;
//            reverse = reverse*10 + remainder;
//        }
//
//        System.out.println("The reverse given string: " + reverse);
//    }

    //method for reverse a number
    public static void reverseNumber(int number)
    {
        if (number < 10)
        {
        //prints the same number if the number is less than 10
            System.out.println(number);
            return;
        }
        else
        {
            System.out.print(number % 10);
            reverseNumber(number/10);
        }
    }
    public static void main(String args[])
    {
        System.out.print("Enter the number that you want to reverse: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print("The reverse of the given number is: ");
    //method calling
        reverseNumber(num);
    }
}
