package com.bridgelabz.Day10;


import java.util.Scanner;

public class MinMaxInteger {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of Array: ");
        int n=sc.nextInt();
        int i;
        int arr[]=new int[n];   //Creating N-size Array

        for(i=0;i<n;i++)   //Entering N numbers in array
        {
            System.out.println("Enter the  Array: ");
            arr[i]=sc.nextInt();
        }
        // Calling getMax() method for getting max value
        int max = MathFunction.getMax(arr);
        System.out.println("Maximum Value is: "+max);

        // Calling getMin() method for getting min value
        int min = MathFunction.getMin(arr);
        System.out.println("Minimum Value is: "+min);
    }
}
