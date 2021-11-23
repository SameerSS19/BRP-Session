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
            String sql = "update address_book set first_name = ? where phone_number = ?;";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, person.getFirst_name());
            stmt.setString(2, person.getPhone_number());
            stmt.executeUpdate();
            dbmsconnect.closeConnection(con, stmt);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateLast_name(Person person){
        try {
            dbmsconnection dbmsconnect = new dbmsconnection("jdbc:mysql://localhost:3306/address_book_system", "root", "password");
            Connection con = dbmsconnect.getConnection();
            String sql = "update address_book set last_name = ? where phone_number = ?;";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, person.getLast_name());
            stmt.setString(2, person.getPhone_number());
            stmt.executeUpdate();
            dbmsconnect.closeConnection(con, stmt);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateCity(Person person){
        try {
            dbmsconnection dbmsconnect = new dbmsconnection("jdbc:mysql://localhost:3306/address_book_system", "root", "password");
            Connection con = dbmsconnect.getConnection();
            String sql = "update address_book set city = ? where phone_number = ?;";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, person.getCity());
            stmt.setString(2, person.getPhone_number());
            stmt.executeUpdate();
            dbmsconnect.closeConnection(con, stmt);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteRecord(Person person) {
        try {
            dbmsconnection dbmsconnect = new dbmsconnection("jdbc:mysql://localhost:3306/address_book_system", "root", "password");
            Connection con = dbmsconnect.getConnection();
            String sql = "delete from address_book where phone_number= ?;";

            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,person.getPhone_number());
            stmt.executeUpdate();
            dbmsconnect.closeConnection(con, stmt);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public List<Person> searchContactAsPhoneNumber(String phone_number){
        try{
            dbmsconnection dbmsconnect = new dbmsconnection("jdbc:mysql://localhost:3306/address_book_system", "root", "password");
            Connection con = dbmsconnect.getConnection();
            String sql = "select * from address_book where phone_number =?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,phone_number);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Person person = new Person();
                person.setFirst_name(rs.getString("first_name"));
                person.setLast_name(rs.getString("last_name"));
                person.setCity(rs.getString("city"));
                person.setPhone_number(rs.getString("phone_number"));
                personList.add(person);
            }
           dbmsconnect.closeConnection(con, stmt);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return personList;
    }

    public List<Person> searchContactAsFirst_name(String first_name){
        try{
            dbmsconnection dbmsconnect = new dbmsconnection("jdbc:mysql://localhost:3306/address_book_system", "root", "password");
            Connection con = dbmsconnect.getConnection();
            String sql = "select * from address_book where first_name =?";
            Person person = new Person();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,first_name);
          //  stmt.setString(2,person.getLast_name());
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                person.setFirst_name(rs.getString("first_name"));
                person.setLast_name(rs.getString("last_name"));
                person.setCity(rs.getString("city"));
                person.setPhone_number(rs.getString("phone_number"));
                personList.add(person);
            }
            dbmsconnect.closeConnection(con, stmt);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return personList;
    }

    public List<Person> sortContactAsFirst_name() {
        try {
            dbmsconnection dbmsconnect = new dbmsconnection("jdbc:mysql://localhost:3306/address_book_system", "root", "password");
            Connection con = dbmsconnect.getConnection();
            String sql = "SELECT * from  address_book Order BY first_name ";
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
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

    public List<Person> sortContactAsLast_name() {
        try {
            dbmsconnection dbmsconnect = new dbmsconnection("jdbc:mysql://localhost:3306/address_book_system", "root", "password");
            Connection con = dbmsconnect.getConnection();
            String sql = "SELECT * from  address_book Order BY last_name ";
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
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

    public List<Person> sortContactAsCity() {
        try {
            dbmsconnection dbmsconnect = new dbmsconnection("jdbc:mysql://localhost:3306/address_book_system", "root", "password");
            Connection con = dbmsconnect.getConnection();
            String sql = "SELECT * from  address_book Order BY city ";
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
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
