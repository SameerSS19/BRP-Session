package com.practiceproblem;

import java.time.LocalDate;
import java.time.Month;

public class InfoCurrntMonth {
    public static void main(String[] args) {

        // information about the month
        LocalDate ldt = LocalDate.of(2016, Month.FEBRUARY, 10);
        Month mn = ldt.getMonth();
        int mnIntValue = mn.getValue();
        int minLength = mn.minLength();
        int maxLength = mn.maxLength();

        System.out.println("\nInteger value of the current month: " + mnIntValue);
        System.out.println("Length of the month: " + minLength);
        System.out.println("Maximum length of the month: " + maxLength);

    }
}
