package com.practiceproblem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class dbmsconnection {
    String url;
    String username;
    String password;

    public dbmsconnection(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public Connection getConnection() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
        Connection con=null;
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(url,username,password);
//        System.out.println("Connection Established Successfully");
        return con;
    }

    public void closeConnection(Connection con, Statement stmt) throws SQLException
    {
        stmt.close();
        con.close();
       // System.out.println("The connection is closed");
    }
}
