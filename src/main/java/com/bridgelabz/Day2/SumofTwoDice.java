package com.bridgelabz.Day2;

import java.util.Random;
public class SumofTwoDice {
    public static void main ( String[] args )
    {
        Random rand = new Random();
        int first=rand.nextInt(6)+1;
        int second=rand.nextInt(6)+1;
        int result=first+second;
        System.out.println("Output::"+result);
    }
}