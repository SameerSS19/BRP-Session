package com.bridgelabz.Day19;

import java.util.Scanner;

public class RollDie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of roll die");
        int n=sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]= (int)(Math.random()*6);
        }
        RollDie.checkOccurrence(arr);
    }
    private static void checkOccurrence(int[] arr){
        int count=0;
        for (int j=1;j<=6;j++){
            for (int i=0;i<arr.length;i++){
                if (count==arr[i]){
                    count++;
                }
            }
            System.out.println(j+count);
        }
    }
}
