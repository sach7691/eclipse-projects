package com.ab.daos;
import java.util.List;
import com.ab.models.Employee;

public interface EmployeeDAO {
	
	public int insertEmployee(Employee employee);
	
	public List<Employee> findEmployee();
	
	public int deleteEmployee(int id);
	
	
	
	
	

}
