package com.ab.daos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.ab.models.Customer;
import com.ab.utilities.DatabaseConnection;

public class CustomerDatabaseDAOImpl implements CustomerDAO {

	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;
	
	@Override
	public Customer registerCustomers(Customer customer) {

        //Step 2 : get a connection from DB Connection
		conn = DatabaseConnection.getConnection();
		
		//Step 3: Create and prepare Statement
		
		String query = "INSERT into Customer (firstName,lastName,customerEmail,customerPassword) VALUES (?,?,?,?)";
		
		try {
		
			pst = conn.prepareStatement(query);
			
			//replace ? with actual values
			
			pst.setString(1, customer.getFirstName());
			pst.setString(2, customer.getLastName());
			pst.setString(3, customer.getCustomerEmail());
			pst.setString(4, customer.getCustomerPassword());
			
			int i = pst.executeUpdate();
			
			if (i >0) {
				
				return customer;
			}
			
		 }catch(SQLException e) {
			 
			 System.out.println(e);			 
	     }
					
		return null;
	}
	
	@Override
	public String loginCustomers(Customer customer) {
		
		String loginStatus = null;
		conn = DatabaseConnection.getConnection();
		
		String query = "SELECT * FROM Customer WHERE customerEmail= ? AND customerPassword = ?";
		
		try {
			
			pst = conn.prepareStatement(query);
			
			//replace ? with actual values
			
			pst.setString(1, customer.getCustomerEmail());
			pst.setString(2, customer.getCustomerPassword());
			
			rs = pst.executeQuery();
			
			if (rs.next()) {
				loginStatus = "Successful";
			}else {
				loginStatus = "Failed";
			}
			

		 }catch(SQLException e) {
			 
			 System.out.println(e);		 
	     }
		
		return loginStatus;	
	}

	@Override
	public List<Customer> listRegisteredCustomers() {
		
        conn = DatabaseConnection.getConnection();
		
		String query = "SELECT customerId,firstName,lastName,customerEmail FROM Customer";
		
		try {
			
			pst = conn.prepareStatement(query);
			
			rs = pst.executeQuery();
			
			List<Customer> cList = new ArrayList<>();
			
			while(rs.next()) {
				
			  Customer cus = new Customer(rs.getInt("customerId"), rs.getString("firstName"), rs.getString("lastName"), rs.getString("customerEmail"));
			  
			  cList.add(cus);	
				
			}
			
			return cList;
			
		}catch (SQLException e) {
			System.out.println(e);
		}
			
		return null;
	}

}
