package com.bridgelabz.Day3;

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        double temperature, windSpeed, windChill;

        System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F:");
        temperature = s.nextDouble();

        System.out.print("Enter the wind speed (>=2) in miles per hour: ");
        windSpeed = s.nextDouble();

        if (temperature < -58 || temperature > 41) {
            System.out.println ("The temperature you entered is invalid.");
        }

        if (windSpeed < 2) {
            System.out.println ("The wind speed you entered is invalid.");
        }

        else {

            windChill = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * temperature * Math.pow(windSpeed, 0.16);

            System.out.print("The wind chill index is " + windChill);
        }
    }
}
