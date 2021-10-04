package com.practiceproblem;

import java.util.Scanner;

public class IndexOfChar2 {
    public static void main(String[] args){
        char a;
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        str = sc.nextLine();
        for(a='a';a<='z';a++){
            System.out.println(a);
            int result = str.indexOf(a,0);
            System.out.println(" "+result+" ");
        }
    }
}
