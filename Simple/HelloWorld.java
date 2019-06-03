/*
* PURPOSE: Makes a connection to an instance of InterSystems IRIS Data Platform.
*/
//package com.intersystems.samples;

import com.intersystems.jdbc.IRISDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class HelloWorld {

	public static void main(String[] args) {
		String ip = "localhost";
		int port = 51773;
		String namespace = "USER";
		String username = "SuperUser";
		String password = "SYS";
		try {
			// Using IRISDataSource to connect
			IRISDataSource ds = new IRISDataSource();

			// Create connection string
			String dbUrl = "jdbc:IRIS://" + ip + ":" + port + "/" + namespace;
			ds.setURL(dbUrl);
			ds.setUser(username);
			ds.setPassword(password);

			// Making connection
			Connection dbconnection = ds.getConnection();
			System.out.println("Hello World! You have successfully connected to InterSystems IRIS via JDBC.");
    		dbconnection.close();
				
		}
		catch ( SQLException e) 
		{ 
			System.out.println(e.getMessage());
		} 
	}

}


