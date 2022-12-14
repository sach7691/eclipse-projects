package com.ab.services;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import com.ab.daos.CustomerDAO;
import com.ab.models.Customer;

public class CustomerServiceImpl implements CustomerService{

	private CustomerDAO customerDAO;
	
	
	public CustomerServiceImpl(CustomerDAO customerDAO) {
		super();
		this.customerDAO = customerDAO;
	}


	@Override
	public Customer registerCustomers(Customer customer) {

		//Password encryption using MD5
		String password = customer.getCustomerPassword();
		String encryptedpassword = null;
		
		try {
		//MessageDigest instance for MD5
		MessageDigest m = MessageDigest.getInstance("MD5");
		//Add plain-text password bytes to digest using MD5 update() method.
		//System.out.println(password);
		m.update(password.getBytes()); 
		//Convert the hash value into bytes
		byte[] bytes = m.digest(); 
		
		//The bytes array has bytes in decimal form. Converting it into hexadecimal format.
		StringBuilder s = new StringBuilder();  
		
        for(int i=0; i< bytes.length ;i++){  
            s.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));  
        }  
      
        //Complete hashed password in hexadecimal format
        encryptedpassword = s.toString(); 
        
        Customer cus = new Customer(customer.getFirstName(),customer.getLastName(),customer.getCustomerEmail(),encryptedpassword);
        
        return this.customerDAO.registerCustomers(cus);
		
		}catch(NoSuchAlgorithmException e) {System.out.println(e);}
		
		return null;
	}
	

	@Override
	public String loginCustomers(Customer customer) {
		
		String password = customer.getCustomerPassword();
		String encryptedpassword = null;
		
		try {
			
			
			MessageDigest m = MessageDigest.getInstance("MD5");
			m.update(password.getBytes()); 
		
			byte[] bytes = m.digest(); 
			
			StringBuilder s = new StringBuilder();  
			
	        for(int i=0; i< bytes.length ;i++){  
	            s.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));  
	        }  
	      
	        encryptedpassword = s.toString(); 
	        
	        Customer cus = new Customer(customer.getFirstName(),customer.getLastName(),customer.getCustomerEmail(),encryptedpassword);
	        
	        
	        
	        return this.customerDAO.loginCustomers(cus);
	        
            }catch(NoSuchAlgorithmException e) {System.out.println(e);}
		
		     return null;	
		
	}

	@Override
	public List<Customer> listRegisteredCustomers() {
		
		return this.customerDAO.listRegisteredCustomers();
	}

}
