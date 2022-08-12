package com.ab.daos;
import com.ab.models.Customer;

public interface CustomerDAO {
	
	public Customer loginCustomer(String customerEmail,String customerPassword);
	public boolean logoutCustomer();
	
	 
}
