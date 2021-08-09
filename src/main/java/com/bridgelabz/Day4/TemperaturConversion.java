package com.bridgelabz.Day4;

import java.util.Scanner;

public class TemperaturConversion {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        double choice,c,f,celcius_fahrenheit,fahrenheit_celcius;
        System.out.println("Enter Choice for Temperature 1- Celcius  2- Fahrenheit");
        choice = cs.nextInt();
        if (choice == 1){
            System.out.println("Enter Temperature in Celcius : ");
            c = cs.nextDouble();
            celcius_fahrenheit = (c * 9/5 ) + 32 ;
            System.out.println("Celcius to Fehrenheit is : "+celcius_fahrenheit);
        }
        else {
            System.out.println("Enter Temperature in Fahrenheit : ");
            f = cs.nextDouble();
            fahrenheit_celcius = (f - 32) * 5 / 9;
            System.out.println("Celcius to Fehrenheit is : " + fahrenheit_celcius);
        }
    }
}
