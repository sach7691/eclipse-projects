package com.ab.services;
import com.ab.models.Customer;
public interface CustomerService{

	public Customer registerCustomer(Customer customer);
	public boolean loginCustomer(String customerEmail, String customerPassword);
	
}