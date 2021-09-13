package com.bridgelabz.Day11;

import java.util.Random;

public class BLRandom {
    public static void main(String[] args) {
        Integer[] val = new Integer[1];
        int sum = 0;
        System.out.println("Random number array...");
        for (int i = 0; i < val.length; i++) {
            val[i] = new Random().nextInt(1000);
            System.out.print(val[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < val.length; i++) {
            sum = sum + val[i];
        }
        System.out.println("Element sum is:" + sum);
    }
}
