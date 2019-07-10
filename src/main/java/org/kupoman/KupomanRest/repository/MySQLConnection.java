package org.kupoman.KupomanRest.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {
	
	public synchronized static Connection getDBConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        // Setup the connection with the DB
        Connection connection = null;
		try {
			connection = DriverManager
			        .getConnection("jdbc:mysql://178.148.67.98:3306/kupoman?"
			                + "user=remote&password=admin");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return connection;
	}
}
