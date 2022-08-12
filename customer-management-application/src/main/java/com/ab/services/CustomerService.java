package com.ab.services;
import java.util.List;
import com.ab.models.Customer;

public interface CustomerService {
	
	    public Customer registerCustomers(Customer customer);
		public String loginCustomers(Customer customer);
		public List<Customer> listRegisteredCustomers();

}
