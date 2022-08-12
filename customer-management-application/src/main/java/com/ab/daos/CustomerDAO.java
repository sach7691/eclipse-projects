package com.ab.daos;
import java.util.List;
import com.ab.models.Customer;

public interface CustomerDAO {

	    public Customer registerCustomers(Customer customer);
		public String loginCustomers(Customer customer);
		public List<Customer> listRegisteredCustomers();
		

	}



