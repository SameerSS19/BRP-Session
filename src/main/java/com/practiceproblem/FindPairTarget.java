package com.practiceproblem;

import java.util.Arrays;
public class FindPairTarget {
    public static void findPair(int[] num, int target)
    {
        int i, j;
        for ( i = 0; i <= num.length; i++)
        {
            for (j = i+1; j < num.length; j++)
            {
                if (num[i] + num[j] == target)
                {
                    System.out.println("Pair found = " + num[i] + " , " + num[j]);
                }
            }
        }
    }

    public static void main (String[] args)
    {
        int[] num = { 8, 7, 2, 5, 3, 1 };
        Arrays.sort(num);
        int target = 10;

        findPair(num, target);
    }
}

