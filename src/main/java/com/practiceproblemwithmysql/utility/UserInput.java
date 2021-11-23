package com.practiceproblemwithmysql.utility;

import com.practiceproblemwithmysql.model.Person;

import java.util.Scanner;

public class UserInput {
    private static UserInput userInput = null;
    Scanner scanner = new Scanner(System.in);
    public static UserInput getInstance(){
        if (userInput == null)
            return new UserInput();
        return userInput;
    }

    public String stringInputUser(){
        String input = null;
        input = scanner.nextLine();
        return input;
    }

//    public Person getMethod(){
//        Person person = new Person();
//        System.out.println("Enter the first name :");
//        person.setFirst_name(stringInputUser());
//        System.out.println("Enter the last name :");
//        person.setLast_name(stringInputUser());
//        System.out.println("Enter the city :");
//        person.setCity(stringInputUser());
//        System.out.println("Enter the phone number :");
//        person.setPhone_number(stringInputUser());
//    }

}
