package com.practiceproblem;

import java.util.Scanner;

public class DivisibleByTarget {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elemnt of array");
        int size = sc.nextInt();
        int a[]=new int[size];
        System.out.println("Enter the element of array");
        for (int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the value ");
        int num = sc.nextInt();
        String result = "";
        int count = 0;
        for (int i=0;i<size;i++){
            if (a[i]%num==0){
                result = result+a[i]+"";
                count++;
            }
        }
        if (count>=1){
            System.out.println("The Given Input are:");
            System.out.println(result);
        }
        else if(count==0){
            System.out.println("No Input given:");
        }
    }
}
