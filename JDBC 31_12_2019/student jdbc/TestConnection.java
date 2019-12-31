package com.tektaurus.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestConnection {

	Connection con;
	public TestConnection()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
			System.out.println("Connected To Database....");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new TestConnection();
	}

}
