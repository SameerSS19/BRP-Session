package com.bridgelabz.Day1;

import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month, day;
        String season = null;
        System.out.print("Please enter month and day: ");
        month = in.nextInt();
        day = in.nextInt();
        if ((month == 3) && (21 <= day)){
                season = "Spring";
        } else if (4 <= month && month <= 6) {
            season = "Spring";
        }
        if((month == 6) && (21 <= day))
            season = "Fall";
        System.out.println(season);
    }
}
