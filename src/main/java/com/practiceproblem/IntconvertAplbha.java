package com.practiceproblem;
import java.util.Scanner;

public class IntconvertAplbha {
    private static final String numtoWord(int num){
        String word = "";
        String unitArray[]={"one",
            "Two",
            "Three" ,
            "Four",
            "Five",
            "Six",
            "Seven",
            "Eight",
            "Nine"};
        // check if number is divisible by 1 million
        if ((num / 1000000) > 0) {
            word += numtoWord(num / 1000000) + " million ";
            num %= 1000000;
        }
        // check if number is divisible by 1 thousand
        if ((num / 1000) > 0) {
            word += numtoWord(num / 1000) + " thousand ";
            num %= 1000;
        }
        // check if number is divisible by 1 hundred
        if ((num / 100) > 0) {
            word += numtoWord(num / 100) + " hundred ";
            num %= 100;
        }
        return word;
    }

    public static void main(String[] args){
            int num = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Please type a number");
            try {
                num = sc.nextInt();
                if (num == 0) {
                    System.out.print("Number in words: Zero");
                } else {
                    System.out.print("Number in words: " + numtoWord(num));
                }
            } catch (Exception e) {
                System.out.println("Please enter a valid number");
            }
    }
}
