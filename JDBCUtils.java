package com.example.model1.repos;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtils {
    private String url;
    private String user;
    private String password;

    public JDBCUtils() {
        loadDBCredentials();
    }

    public Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println("Error getting connection " + e);
        }
        return connection;
    }

    private void loadDBCredentials() {
        url = "jdbc:postgresql://localhost:5433/model1";
        user = "postgres";
        password = "postgres";

    }
}