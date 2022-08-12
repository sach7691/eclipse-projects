package com.ab.controllers;
import com.ab.services.CustomerService;
import com.ab.models.Customer;
public class CustomerController{
	
	
	private CustomerService customerService;
	
	
	public CustomerController(CustomerService customerService){
		
		this.customerService = customerService;
		
	}
	
	// Request Mapping methods
	
	public Customer saveCustomerData(Customer customer){
	
		return customerService.registerCustomer(customer);
			
	}
	
    public boolean loginProcess(String cutomerEmail,String cutomerPassword) {
		
		return this.customerService.loginCustomer(cutomerEmail, cutomerPassword);
	}
	
	
	
	
	
}
