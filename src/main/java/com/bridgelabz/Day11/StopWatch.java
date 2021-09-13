package com.bridgelabz.Day11;

public class StopWatch {
    public void display(){
        System.out.println("Calculating Method execution time:");
    }

    public static void main(String[] args) {
        StopWatch stw = new StopWatch();

        long start = System.nanoTime();

        stw.display();
        long end = System.nanoTime();
        long execution = end - start;
        System.out.println("Execution Time :" + execution+ " nanosecond");
    }
}
