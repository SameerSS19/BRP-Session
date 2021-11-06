package com.practiceproblem;

import java.sql.*;

public class DBdemo {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/address_book_system?useSSL=false";
        String username = "root";
        String password = "password";
        Connection connection;

        try {
            Class.forName("java.sql.Driver");
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        }
        System.out.println("Driver loaded!");

        try {
            System.out.println("Connecting to database:"+jdbcURL);
            connection= DriverManager.getConnection(jdbcURL, username, password);
            System.out.println("Connection is successful!!!"+connection);
            Statement stnt = connection.createStatement();
            ResultSet rst = stnt.executeQuery("SELECT * FROM address_book_system.address_book;");
            while (rst.next()){
                System.out.println("Name : "+rst.getString("first_name"));
            }
            PreparedStatement preparedStatement = connection.prepareStatement("insert into address_book_system.address_book values (?,?,?,?,?,?,?,?,?,?)");
            preparedStatement.setInt(1,13);
            preparedStatement.setString(2,"Prasanna");
            preparedStatement.setString(3,"Prasanna");
            preparedStatement.setString(4,"H.No 2");
            preparedStatement.setString(5,"Mumbai");
            preparedStatement.setString(6,"Goa");
            preparedStatement.setInt(7,552244);
            preparedStatement.setInt(8,987654321);
            preparedStatement.setString(9,"pra@gmail.com");
            preparedStatement.setString(10,"Friend");
            preparedStatement.executeUpdate();

        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
