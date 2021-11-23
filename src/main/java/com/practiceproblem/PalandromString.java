package com.practiceproblem;

import java.util.Scanner;

public class PalandromString {
    public static void main(String[] args) {
        String value, reverse = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");
        value = scanner.nextLine();
        int length = value.length();
        for (int i = length-1;i>=0;i--){
            reverse = reverse + value.charAt(i);
        }if (value.equals(reverse)){
            System.out.println("Enter the String");
        }else
            System.out.println("enter the String repeat");
    }
}
