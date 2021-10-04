package com.practiceproblem;

public class Pattern {
    public static void main(String args[])
    {
        int i, j, row = 1;
        for (i=1; i<4; i++)
        {
            for (j=1; j<i; j++)
            {
                System.out.print(i+"");
            }
            System.out.println();
        }
    }
}
