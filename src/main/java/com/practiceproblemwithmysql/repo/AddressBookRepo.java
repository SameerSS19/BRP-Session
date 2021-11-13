package com.practiceproblemwithmysql.repo;

import com.practiceproblem.dbmsconnection;
import com.practiceproblemwithmysql.model.Person;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class AddressBookRepo {
    private static List< Person > personList = new ArrayList<>();

    public void save(Person person) {
        try {
            dbmsconnection dbmsconnect = new dbmsconnection("jdbc:mysql://localhost:3306/address_book_system", "root", "password");
            Connection con = dbmsconnect.getConnection();
            String sql = "insert into address_book values (?,?,?,?);";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, person.getFirst_name());
            stmt.setString(2, person.getLast_name());
            stmt.setString(3, person.getCity());
            stmt.setString(4, person.getPhone_number());
            stmt.executeUpdate();
            System.out.println("Record  inserted successfully");
            dbmsconnect.closeConnection(con, stmt);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateContact(Person person) {
        try {
            dbmsconnection dbmsconnect = new dbmsconnection("jdbc:mysql://localhost:3306/address_book_system", "root", "password");
            Connection con = dbmsconnect.getConnection();
            String sql = "update address_book set phone_number = ? Where first_name = ?;";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, person.getFirst_name());
            stmt.setString(2, person.getLast_name());
            stmt.setString(3, person.getPhone_number());
            stmt.executeUpdate();
            System.out.println("Record  update successfully");
            dbmsconnect.closeConnection(con, stmt);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteRecord(Person person) {
        try {
            dbmsconnection dbmsconnect = new dbmsconnection("jdbc:mysql://localhost:3306/address_book_system", "root", "password");
            Connection con = dbmsconnect.getConnection();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the name: ");
            String first_name = scanner.nextLine();
            String sql = "delete from address_book where first_name= ?;";

            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, first_name);
            int i = stmt.executeUpdate();
            if (i > 0) {
                System.out.println("Record Deleted Successfully");
            } else {
                System.out.println("No Such Record in the Database");
            }
            dbmsconnect.closeConnection(con, stmt);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public List< Person > getAllContactDB() {
        try {
            dbmsconnection dbmsconnect = new dbmsconnection("jdbc:mysql://localhost:3306/address_book_system", "root", "password");
            Connection con = dbmsconnect.getConnection();
            String sql = "SELECT * from  address_book ";
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                System.out.println("All Contact data: " + resultSet.getString("first_name"));
                Person person = new Person();
                personList.add(person);
            }

            dbmsconnect.closeConnection(con, statement);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return personList;
    }
}
