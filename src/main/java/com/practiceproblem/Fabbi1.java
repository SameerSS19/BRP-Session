package com.practiceproblem;

import java.util.Scanner;

public class Fabbi1 {
    static int Fabinno(int n){
       if(n<=1)
           return n;

       return Fabinno(n - 1)
               +Fabinno(n -2);

    }
    public static void main(String[] args){
        Scanner sc=  new Scanner(System.in);
        System.out.println("Enter the Number:");
        int N = sc.nextInt();
        for (int i=1;i<N;i++)
        {
            System.out.println(Fabinno(i)+"");
        }
    }
}
