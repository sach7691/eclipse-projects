package com.ab.services;

import java.util.List;

import com.ab.models.Employee;

public interface EmployeeService {
	
	public int insertEmployee(Employee employee);
	
	public List<Employee> findEmployee();
	
	public int deleteEmployee(int id);

}
