/*
* PURPOSE: Makes a connection to an instance of InterSystems IRIS Data Platform. This example also retrieves petstore data that is available within a trial instance of InterSystems IRIS.
*/

import com.intersystems.jdbc.IRISDataSource;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
			
			// Retrieve first 5 yellow birds from InterSystems IRIS using JDBC
            String sql = "SELECT TOP(5) name from Demo.Pet where color='Yellow' and type='bird'";
            PreparedStatement myStatement = dbconnection.prepareStatement(sql);
            ResultSet myRS = myStatement.executeQuery();
            System.out.println("Name");
            while (myRS.next())
            {
                String name= myRS.getString("Name");
                System.out.println(name);
            } 
            dbconnection.close();
				
		}
		catch ( SQLException e) 
		{ 
			System.out.println(e.getMessage());
		} 
	}

}


