package com.practiceproblemwithmysql.utility;

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

}
