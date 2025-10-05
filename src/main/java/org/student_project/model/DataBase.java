package org.student_project.model;

import java.sql.*;

public class DataBase {
    private static final String URL="jdbc:mysql://localhost:3306/student_project";
    private static final String USERNAME="root";
    private static final String PASSWORD="";

    public static  Connection getConnection() {
        Connection connection =null;
        try {
            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            System.out.println("Connected to database successfully");

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    return connection;
    }






}
