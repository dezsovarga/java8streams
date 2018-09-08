package com.dezso.varga.exercise.jdbc;

import java.sql.*;
import java.util.Map;

public class JdbcMain {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/backgammon";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "lepedo";

    public static void main(String args[]) {

        try (
                Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement()
            )
        {
            //STEP 2: Register JDBC driver
            Class.forName(JDBC_DRIVER);

            //Open a connection
            System.out.println("Connecting to database...");

            //Execute a query
            System.out.println("Creating statement");
            String sql = "select * from account;";
            ResultSet rs = stmt.executeQuery(sql);

            //Extract data from result set
            Map<Integer, String> map = JdbcUtil.getResults(rs);
        }
        catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
        }
        catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
        }
    }
}
