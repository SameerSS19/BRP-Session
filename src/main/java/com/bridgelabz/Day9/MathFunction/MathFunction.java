package com.bridgelabz.Day9.MathFunction;

public class MathFunction {
    /*
   a. To return an harmonic number
    */
    public static void harmonicSeries(int num) {
        for (int i = 1 ; i <= num ; i++){
            if (i == num)
                System.out.print(" 1/" +i);
            else
                System.out.print(" 1/" +i+ " + " );
        }
    }
    /*
    b. To return a sin of an angle
     */
    public static void isSin(double sin) {
        double radian = Math.toRadians(sin);
        double sinValue = Math.sin(radian);
        System.out.println("sin(" +sin+ ") =" +sinValue);
    }
    /*
    c. To return cosine of an angle
     */
    public static void isCosine(double cosine) {
        double radian = Math.toRadians(cosine);
        double cosValue = Math.cos(radian);
        System.out.println("cos(" +cosine+ ") =" +cosValue);
    }
    /*
    d. To return Binary of a number
     */
    public static void Binary(int decimal) {
        int binary=0,reminder,temp=1;
        while (decimal!=0){
            reminder = decimal % 2;
            decimal = decimal / 2;
            binary = binary + reminder * temp;
            temp = temp * 10;
        }
        System.out.println("Binary number is : "+binary);
    }
}
