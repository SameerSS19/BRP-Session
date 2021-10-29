package com.practiceproblem;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int i,j,k=1,n;
        System.out.println("Enter Number of Rows");
        n= in.nextInt();
        int ar[][]=new int[n][n];
        for(j=n-1;j>=0;j--) //Storing Elements
        {
            for(i=n-1;i>=j;i--)
            {
                ar[i][j]=k;
                k++;
            }
        }
        for(j=0;j<n;j++) //Printing Pattern
        {
            for(i=0;i<=j;i++)
            {
                System.out.print(ar[i][j]+"\t");
            }
            System.out.println();
        }
    }//end of main method
}//end of class

