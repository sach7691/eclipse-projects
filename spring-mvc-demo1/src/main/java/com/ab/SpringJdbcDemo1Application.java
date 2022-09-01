package com.ab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import com.ab.models.Employee;
import com.ab.services.EmployeeService;


@SpringBootApplication
public class SpringJdbcDemo1Application implements CommandLineRunner{
	
	//@Autowired
	//private JdbcTemplate jdbcTemplate;
	@Autowired
	private EmployeeService employeeService;

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcDemo1Application.class, args);
			
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		//System.out.println(jdbcTemplate);
     //Employee e = new Employee(2, "kevin");
     //  System.out.println(employeeService.insertEmployee(e));
		
		System.out.println(employeeService.findEmployee());
		
		//System.out.println(employeeService.deleteEmployee(1));
		
		
	}

}
