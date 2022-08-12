package com.ab.daos;
import com.ab.models.Customer;
import java.util.List;
import java.util.ArrayList;
public class CustomerDAO{


	private List<Customer> customers;
	
	
	public CustomerDAO(List<Customer> customers){
		
		this.customers = customers;
		
	}
		
	
	public Customer storeCustomerDetails(Customer customer){


	   if(this.customers.add(customer)) // this will store customer details in a List
	     return customer;
	   else
		 return null;

	}
	
	public boolean loginCheck(String customerEmail,String customerPassword ) {
		
		boolean found = false;
		
		for(Customer c : this.customers) {
			
			if(c.getCustomerEmail().equals(customerEmail) && c.getCustomerPassword().equals(customerPassword)) {
				found = true;
				
			}
		}
		
		return found;
		
	}
	


}