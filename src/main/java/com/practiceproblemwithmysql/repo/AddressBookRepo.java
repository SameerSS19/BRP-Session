package com.practiceproblemwithmysql.repo;

import com.practiceproblem.dbmsconnection;
import com.practiceproblemwithmysql.model.Person;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class AddressBookRepo {
    private static List< Person > personList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

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
            System.out.println("Enter Your Name: ");
            person.setFirst_name(scanner.nextLine());
            System.out.println("Enter the new phone number");
            person.setPhone_number(scanner.nextLine());
            String sql = "update address_book set phone_number = ? where first_name = ?;";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, person.getFirst_name());
            stmt.setString(2, person.getPhone_number());
            int i = stmt.executeUpdate();
            if(i>0)
            {
                System.out.println("Record updated sucessfully");
            }else
            {
                System.out.println("No Such record in the Database");
            }
            dbmsconnect.closeConnection(con, stmt);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteRecord(Person person) {
        try {
            dbmsconnection dbmsconnect = new dbmsconnection("jdbc:mysql://localhost:3306/address_book_system", "root", "password");
            Connection con = dbmsconnect.getConnection();

            System.out.println("Enter the Phone Number: ");
            person.setPhone_number(scanner.nextLine());
            String sql = "delete from address_book where phone_number= ?;";

            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,person.getPhone_number());
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

    public Person searchContact(String phone_number){
        Person person = new Person();
        try{
            dbmsconnection dbmsconnect = new dbmsconnection("jdbc:mysql://localhost:3306/address_book_system", "root", "password");
            Connection con = dbmsconnect.getConnection();
            String sql = "select * from address_book where phone_number =?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,phone_number);
            ResultSet rs = stmt.executeQuery();

            person.setFirst_name(rs.getString("first_name"));
            person.setLast_name(rs.getString("last_name"));
            person.setCity(rs.getString("city"));
            person.setPhone_number(rs.getString("phone_number"));

           dbmsconnect.closeConnection(con, stmt);
        }catch (Exception e) {
            e.printStackTrace();
        }return person;
    }

    public List< Person > getAllContactDB() {
        try {
            dbmsconnection dbmsconnect = new dbmsconnection("jdbc:mysql://localhost:3306/address_book_system", "root", "password");
            Connection con = dbmsconnect.getConnection();
            String sql = "SELECT * from  address_book ";
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
              //  System.out.println("All Contact data: " + resultSet.getString("first_name"));
                Person person = new Person();
                person.setFirst_name(resultSet.getString("first_name"));
                person.setLast_name(resultSet.getString("last_name"));
                person.setCity(resultSet.getString("city"));
                person.setPhone_number(resultSet.getString("phone_number"));
                personList.add(person);
            }

            dbmsconnect.closeConnection(con, statement);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return personList;
    }
}
