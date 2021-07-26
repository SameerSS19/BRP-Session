package com.bridgelabz;

import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args)
    {
        String str;
        System.out.println("Enter a string: ");
        Scanner scanner = new Scanner(System.in);
        str = scanner.nextLine();
        String str1 = " ";
        String a[] = str.split(" ");
        for (int i=0;i< a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println(" ");
        for (int i=a.length - 1; i >= 0; i--)
        {
            str1= str1+a[i]+" ";
        }
        System.out.println("Reverse Words is :" +str1);

    }
}

