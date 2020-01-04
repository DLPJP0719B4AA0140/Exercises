package com;
 
import java.sql.Connection;
import java.sql.DriverManager;
 
public class DBConnection {
	static final String URL="jdbc:oracle:thin:@localhost:1521:orcl";
	static final String USERNAME="system";
	static final String PASSWORD="seed1234";
	
	public static Connection getConnection(){
		Connection con=null;
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection(URL,USERNAME,PASSWORD);
 
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return con;
	}
}