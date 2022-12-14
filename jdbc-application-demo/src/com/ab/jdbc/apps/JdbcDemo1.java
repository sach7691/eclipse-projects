package com.ab.jdbc.apps;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
;
public class JdbcDemo1 {

	public static void main(String[] args) {
		
		try {
		//Step 1: Load Driver Class and register with Driver Manager
		
		Class.forName("com.mysql.jdbc.Driver");
		
		//Step 2: Establish the connection using Driver Manager
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root","");
		
		//Step 3 : Create or prepare a statement
		
		Statement st = conn.createStatement();
		
		//Step 4: Execute queries and SQL statements
		
		//st.execute("CREATE table Customer(customer_id int PRIMARY KEY,customer_name varchar(20))");
		
	//	String query = "INSERT into Customer VALUES(4,'Mary')";
    //  String query = "UPDATE Customer set customer_name = 'Anu' where customer_id = 1";
	//	String query = "DELETE FROM Customer WHERE customer_id = 4";
	//	String query = "ALTER TABLE Customer CHANGE customer_id cus_id int;";
//		st.execute(query);
		
		String query = "SELECT * FROM Customer";
		ResultSet rs = st.executeQuery(query);
		
		 
		while(rs.next()){
			  int id = rs.getInt("cus_id");
			  String name = rs.getString("customer_name");
			  System.out.println(id+","+name + "\n");
		}
		
		
		
		// Step 5: Close established connection
		
		st.close();
		conn.close();
		
		//System.out.println("Table is created");
		
		}catch(ClassNotFoundException e) {
			
			System.out.println(e);
			
		}catch (SQLException e) {
			
			System.out.println(e);
		}
		
		
		
		
		
		
		
		
		
		
	}

}
