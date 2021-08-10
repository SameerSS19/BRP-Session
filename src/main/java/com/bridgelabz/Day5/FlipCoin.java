package com.bridgelabz.Day5;

import java.util.Scanner;

public class FlipCoin {
        public String flip () {
            int num = (int) Math.floor(Math.random() * 10 ) % 2;
            if (num == 0)
                return "heads";
            else
                return "tails";
        }
    }
     class Toss {
        public static void main(String[] args) {
            FlipCoin t = new FlipCoin();
            Scanner sc = new Scanner(System.in);
            int size;
            int head = 0;
            int tail = 1;

            System.out.println("Enter number of Turn To be Flip :");
            size = sc.nextInt();

            for (int i = 1; i < size; i++) {
                if (t.flip().equals("heads")) {
                    head++;
                } else {
                    tail++;
                }
            }
            System.out.println("Size = " + size);
            System.out.println("Heads : " + head);
            System.out.println("Tails : " + tail);
        }
}
