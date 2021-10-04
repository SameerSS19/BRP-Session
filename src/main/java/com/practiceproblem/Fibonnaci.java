package com.practiceproblem;

class Fibonacci {

    static void primeFabonacciSeries(int n) {
        Boolean[] prime = new Boolean[n + 1];
        for (int p = 0; p <=n; p++)
            prime[p] = true;
        for (int p = 2; p * p <= n; p++) {
            if (prime[p] == true) {
                for (int i = p * 2; i <= n; i += p)
                    prime[i] = false;
            }
        }
        for (int i = 2; i <= n; i++) {
            double sqrt = Math.sqrt(5 * i * i + 4);
            double sqrt1 = Math.sqrt(5 * i * i - 4);
            int x = (int) sqrt;
            int y = (int) sqrt1;
            if (prime[i] == true && (Math.pow(sqrt, 2)) ==
                    Math.pow(x, 2) || Math.pow(sqrt1, 2) ==
                    Math.pow(y, 2))
            System.out.print(i + "");
        }
    }
    public static void main(String[] args){
        int n = 100;
        primeFabonacciSeries(n);
    }
}
