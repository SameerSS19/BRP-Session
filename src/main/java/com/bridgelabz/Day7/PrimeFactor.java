package com.bridgelabz.Day7;

import java.util.Scanner;

public class PrimeFactor {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num,i;
        System.out.println("Enter a number:");
        num = sc.nextInt();
        System.out.println("Prime Factor of " +num+ " are ");
        while (num%2==0){
            System.out.println("2");
            num=num/2;
        }
        for (i=3;i<Math.sqrt(num);i=i+2){
            while (num%i==0){
                System.out.println(i+"");
                num=num/i;
            }
        }
        if(num>2)
            System.out.println(num+"");
    }
}
