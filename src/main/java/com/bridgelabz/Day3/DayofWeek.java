package com.bridgelabz.Day3;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DayofWeek {
    static int method(int year, int month, int day) {
        //to check the validity of day of month
        int[] darr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        //check validity of year and month
        if (year > 0 && (month > 0 && month <= 12)) {
            // check for a leap year and month of February.
            if ((year % 4 == 0 || year % 400 == 0) &&
                    month == 2 && (day > 0 && day <= 29)) {
                // month starts at zero, so we need to put ( month - 1 ).
                Calendar calendar = new GregorianCalendar(year, month - 1, day);
                return calendar.get(Calendar.DAY_OF_WEEK);
            } else {
                //check the range of the month
                if (day > 0 && day <= darr[month - 1]) {
                    //month start at zero ,so we need to put (month-1)
                    Calendar calendar = new GregorianCalendar(year, month - 1, day);
                    return calendar.get(Calendar.DAY_OF_WEEK);
                } else
                    return 0;
            }
        } else
            return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] dayofweek = {" Invalid", "Sun", "Mon", "Tue", "Wed", "Thur", "Fri", "Sat"};
        int y, m, d;
        System.out.println("Enter Year: ");
        y = sc.nextInt();
        System.out.println("Enter Month: ");
        m = sc.nextInt();
        System.out.println("Enter Day: ");
        d = sc.nextInt();
        System.out.println("Day Of Week is : " + dayofweek[method(y, m, d)]);
    }
}