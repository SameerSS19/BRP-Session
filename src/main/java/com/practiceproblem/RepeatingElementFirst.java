package com.practiceproblem;


import java.util.Scanner;

public class RepeatingElementFirst {
    public static void main(String[] args)
    {
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter the element");
        int n = sr.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sr.nextInt();
        }
        int temp=0;
        for(int i=0;i<n;i++) // select an element
            for(int j=i+1;j<n;j++) //traverse ahead and check for duplicate
                if(arr[i]==arr[j])
                {

                    System.out.println("Repeating Element found "+arr[i]);
                    temp=1;
                    i=n;j=n;
                }
        if(temp==0){
            System.out.println("No repeating integer found");
        }

    }
}
