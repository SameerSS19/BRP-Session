package com.practiceproblem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DemoEmp {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/address_book_system?useSSL=false";
        String username1 = "root";
        String password = "password";
        Connection connection;
        try {
            Class.forName("java.sql.Driver");
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        }
        System.out.println("Driver loaded!");
        try {
            System.out.println("Connecting to database:" + jdbcURL);
            connection = DriverManager.getConnection(jdbcURL, username1, password);
            System.out.println("Connection is successful!!!" + connection);
            String user_name, name, phone_number;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the first name: ");
            user_name = input.nextLine();
            System.out.println("Enter the last name : ");
            name = input.nextLine();
            System.out.println("Enter the Phone number: ");
            phone_number = input.nextLine();
            //insert into address_book_system.address_book values ( null , 'Sairam', 'Mon', '9971085679');
            PreparedStatement preparedStatement = connection.prepareStatement("insert into address_book_system.address_book values (?,?,?,?)");
            preparedStatement.setInt(1, 0);
            preparedStatement.setString(2, user_name);
            preparedStatement.setString(3, name);
            preparedStatement.setString(4, phone_number);
            preparedStatement.executeUpdate();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
