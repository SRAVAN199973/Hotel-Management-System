package com.revature.foundation_project.hotel_management.receptionist;
import java.sql.*;

public class MySqlAccess {
	private static Connection connection=null;//its a interface which establish connection
	private static Statement statement=null;//its a static sql execution of statement
	private PreparedStatement preparedStatement=null;//new version which execute recent data
	private ResultSet resultSet=null;
	static {
		try {
		connection=DriverManager.getConnection("jdbc:mysql://localhost/hotel_management","root","Prabhat44@");
		System.out.println("Database connectivity successfull");
		statement=connection.createStatement();
		}catch(Exception e) {
			System.out.println("No Connection");
		}
		}
	  public static Connection getConnection()
	    {
	        return connection;
	    }
	  public static Statement getStatement() {
		  return statement;
	  }

}

