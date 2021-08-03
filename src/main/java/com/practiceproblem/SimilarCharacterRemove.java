package com.practiceproblem;

import java.util.Scanner;

public class SimilarCharacterRemove {
    public static void main(String [] args)
    {
        String s1 = "", s2 = "";

        System.out.print("\n Enter the String 1 : ");
        Scanner scan = new Scanner(System.in);
        s1 =scan.nextLine();
        System.out.print("\n Enter the String 2 : ");
        s2 =scan.nextLine();
        String a = s1;
        String b = s2;
        char temp ;
        String ser = "";
        String repl = "";

        for(int i= 0; i < s1.length(); i++)
        {
            temp = s1.charAt(i);
            ser = Character.toString(temp);

            for(int j = 0; j < s2.length(); j++)
            {
                if(temp == s2.charAt(j))
                {
                    a = a.replace(ser, repl);
                    b = b.replace(ser, repl);
                }
            }
        }

        System.out.println("\n Common Characters Removed String 1 : " + a);
        System.out.println("\n Common Characters Removed String 2 : " + b);

    }
}