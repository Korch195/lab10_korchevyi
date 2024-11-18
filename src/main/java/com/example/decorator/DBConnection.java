package com.example.decorator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConnection {
    
    private static DBConnection dbConnection;
    private Connection connection;

    DBConnection() throws SQLException {
        this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");

    }
    
    public String getDocument(String dcsPath) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM documents WHERE path = ?");
        statement.setString(1, dcsPath);
                return dcsPath;
        
    }

    public static DBConnection getInstance() throws SQLException {
        if (dbConnection == null) {
            dbConnection = new DBConnection();
        }
        return dbConnection;
    }
}
