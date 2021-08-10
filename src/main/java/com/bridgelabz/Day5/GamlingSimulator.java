package com.bridgelabz.Day5;

import java.util.Scanner;

public class GamlingSimulator {
    static void playGame(int Stake,int Goal,int Trails){
        int bets = 0;
        int wins = 0;
        for (int i=0;i<Trails;i++){
            int cash = Stake;

            while (cash > 0 && cash < Goal){
                bets++;

                if (Math.random() < 0.5)
                    cash++;
                else
                    cash--;
            }
            if (cash == Goal)
                wins++;
        }
        System.out.println(wins + " wins of " + Trails);
        System.out.println("Percent of games won = " + 100.0 * wins / Trails);
        System.out.println("Avg Number of bets  = " + 1.0 * bets / Trails);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Stake : ");
        int Stake = sc.nextInt();
        System.out.println("Enter Goal : ");
        int Goal = sc.nextInt();
        System.out.println("Enter Number of Times : ");
        int Trails = sc.nextInt();
        playGame(Stake,Goal,Trails);
    }
}
