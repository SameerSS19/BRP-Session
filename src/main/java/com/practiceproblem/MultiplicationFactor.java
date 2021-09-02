package com.practiceproblem;

public class MultiplicationFactor {
    public static final long M = 100000007;
        static long MultipleFactor( int n){
        long num = 1;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (n / i == i)
                    num = (num * i) % M;
                else {
                    num = (num * i) % M;
                    num = (num * n / i) % M;
                }
            }
        }
        return num;
    }
        public static void main (String[] args)
        {
            int n = 12;
            System.out.println(MultipleFactor(n));
        }
    }

