package com.ab.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ab.daos.EmployeeDAO;
import com.ab.models.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;
	
	@Override
	public int insertEmployee(Employee employee) {
		
		return employeeDAO.insertEmployee(employee);
	}

	@Override
	public List<Employee> findEmployee() {
		
		return employeeDAO.findEmployee();
	}

	@Override
	public int deleteEmployee(int id) {
	
		return employeeDAO.deleteEmployee(id);
	}

}
