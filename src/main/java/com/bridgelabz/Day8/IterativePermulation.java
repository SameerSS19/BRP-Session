package com.bridgelabz.Day8;

import java.util.Scanner;

public class IterativePermulation {
    // Function to print all the permutations of str
    static void printPermutn(String str, String ans)
    {
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1);
            printPermutn(ros, ans + ch);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1;
        System.out.println("Enter your String : ");
        str1 = sc.nextLine();
        printPermutn(str1,"");
    }
}
