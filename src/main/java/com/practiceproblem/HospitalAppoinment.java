package com.practiceproblem;

import java.util.Scanner;
public class HospitalAppoinment {
    public static void main(String[] args) {
        String date,sid, sname, addr, sex ,drname, ill;
        int fee;
        Scanner input = new Scanner(System.in);
        System.out.println("Date:");
        date = input.nextLine();
        System.out.println("Id:");
        sid = input.nextLine();
        System.out.println("Name:");
        sname = input.nextLine();
        System.out.println("Address:");
        addr = input.nextLine();
        System.out.println("Sex:");
        sex = input.nextLine();
        System.out.println("Illness:");
        ill = input.nextLine();
        System.out.println("Dr.Name:");
        drname = input.nextLine();
        System.out.println("Appointment Fees :");
        fee = input.nextInt();

        System.out.println(date+"\t"+sid + "\t" + sname + "\t"+ addr +"\t" + sex + "\t" +  ill  +"\t"+ drname + "\t"+ fee);
    }
}