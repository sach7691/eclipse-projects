package com.ab.utilities;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	
	private static Connection conn; //Static, because this will not change for whole application program, persist a constant connection
	
	private DatabaseConnection() {
		//This will restrict users from creating object using DatabaseConnection class
	}
	
	public static Connection getConnection() {
			
			try{
				 //Load Driver class and register with Driver Manager
				 Class.forName("com.mysql.cj.jdbc.Driver");
				  
				 //Establish connection using Driver Manager
				 conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root","");
				   
				
				}catch(ClassNotFoundException ex) {
					
					System.out.println(ex);
					
				}catch(SQLException e) {
					
					System.out.println(e);
				}
						
			return conn;
		}


}



	