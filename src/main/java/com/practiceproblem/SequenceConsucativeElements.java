package com.practiceproblem;

import java.util.Scanner;

public class SequenceConsucativeElements {
    public static String similar(String s, String t){
        int n = Math.min(s.length(),t.length());
        for(int i = 0; i < n; i++){
            if(s.charAt(i) != t.charAt(i)){
                return s.substring(0,i);
            }
        }
        return s.substring(0,n);
    }

    public static void main(String[] args) {
        String str;
        System.out.println("\n Enter the String  : ");
        Scanner scan = new Scanner(System.in);
        str =scan.nextLine();
        String store="";
        int n = str.length();
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                String x = similar(str.substring(i,n),str.substring(j,n));
                if(x.length() > store.length()) store=x;
            }
        }
        System.out.println("Sequence Character are : "+store);
    }
}
