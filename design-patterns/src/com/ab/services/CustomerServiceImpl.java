package com.ab.services;
import com.ab.daos.CustomerDAO;
import com.ab.models.Customer;
public class CustomerServiceImpl implements CustomerService{



	private CustomerDAO customerDAO;
	
	
	public CustomerServiceImpl(CustomerDAO customerDAO){
		
		this.customerDAO = customerDAO;
		
	}

	// Service class holds business logic
	
	@Override
	public Customer registerCustomer(Customer customer){
	
	
	   return customerDAO.storeCustomerDetails(customer);	
	
	}

	@Override
	public boolean loginCustomer(String customerEmail,String customerPassword ) {
		
		return customerDAO.loginCheck(customerEmail, customerPassword);
			
	}

}