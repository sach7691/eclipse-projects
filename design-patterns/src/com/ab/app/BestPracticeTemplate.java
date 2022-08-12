package com.ab.app;
import java.util.ArrayList;
import java.util.List;

import com.ab.controllers.CustomerController;
import com.ab.daos.CustomerDAO;
import com.ab.models.Customer;
import com.ab.services.CustomerService;
import com.ab.services.CustomerServiceImpl;
public class BestPracticeTemplate{
	
	public static void main(String[] args){
	  
		List<Customer> customers = new ArrayList<>(); //model
		 
	  
		CustomerDAO customerDAO = new CustomerDAO(customers); //DAO
		 
		 
	  
		CustomerService customerService = new CustomerServiceImpl(customerDAO); //service layer
		 
		 
	  
	    CustomerController ctrl = new CustomerController(customerService); //controller
		 
		 
		Customer registerCustomer = ctrl.saveCustomerData(new Customer(1,"kpashindla@gmail.com","1234"));
		 
		 
		System.out.println("A new customer registered with following details");
		 
		if(registerCustomer != null){
			System.out.println(registerCustomer.getCustomerId()+"  "+registerCustomer.getCustomerEmail());
		}
		else{
			System.out.println("Unable to register");
		 }
		
		
		
		if(ctrl.loginProcess("kpashindla@gmail.com", "1234")) {
			System.out.println(":)");
		}
		else {
			
			System.out.println("Invalid customer");
		}
		
		
		
		
	  }
	  
}

