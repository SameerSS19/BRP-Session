package com.bridgelabz.Day19;

import java.util.Scanner;

public class HarmonicSeriesAdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("The Harmonic Series is :");
        int num = sc.nextInt();
        double result =0.0;
        while (num>0)
        {
            result = result+(double)1/num;
            num--;
            System.out.print(result+" ");
        }
        System.out.println(" ");
        System.out.println("Output Harmonic Series is:"+result);
    }
}
