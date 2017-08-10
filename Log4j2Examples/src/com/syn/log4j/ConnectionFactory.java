package com.syn.log4j;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class ConnectionFactory {
    //static reference to itself
    private static ConnectionFactory instance = new ConnectionFactory();
    String connectionUrl = "jdbc:sqlserver://localhost:1433;" +
    		   "databaseName=madhusudhan;user=sa;password=master;";
    public static final String DRIVER_CLASS = "com.microsoft.sqlserver.jdbc.SQLServerDriver"; 
     
    //private constructor
    private ConnectionFactory() {
        try {
            Class.forName(DRIVER_CLASS);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
     
    private Connection createConnection() {
        Connection connection = null;
        try {
        	System.out.println("the connection is successfull");
            connection = DriverManager.getConnection(connectionUrl);
        } catch (SQLException e) {
            System.out.println("ERROR: Unable to Connect to Database.");
        }
        return connection;
    }   
     
    public static Connection getConnection() {
        return instance.createConnection();
    }
}*/

public class ConnectionFactory {
    private static String url = "jdbc:sqlserver://SERVER2:1433;databaseName=madhusudhan";    
    private static String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";   
    private static String username = "sa";   
    private static String password = "master";
    private static Connection connection;


    public static Connection getConnection() {
        try {
            Class.forName(driverName);
            try {
            	connection = DriverManager.getConnection(url, username, password);
            } catch (SQLException ex) {
                // log an exception. fro example:
                System.out.println("Failed to create the database connection."); 
            }
        } catch (ClassNotFoundException ex) {
            // log an exception. for example:
            System.out.println("Driver not found."); 
        }
        return connection;
    }
}