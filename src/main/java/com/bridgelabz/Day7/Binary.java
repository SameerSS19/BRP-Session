package com.bridgelabz.Day7;

import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimalNo,binary=0,reminder,temp=1;
        System.out.println("Enter a Decimal Number : ");
        decimalNo = sc.nextInt();
        while (decimalNo!=0){
            reminder = decimalNo % 2;
            decimalNo = decimalNo / 2;
            binary = binary + reminder * temp;
            temp = temp * 10;
        }
        System.out.println("The Binary Number is : "+binary);
    }
}
