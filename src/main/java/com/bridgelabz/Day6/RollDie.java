package com.bridgelabz.Day6;

public class RollDie {
    public static void main(String[] args) {
        int SIDES = 6;   // how many sides on the die?

        // roll should be 1 through SIDES
        int roll = (int) (Math.random() * SIDES) + 1;

        // print result
        System.out.println(roll);

    }
}
