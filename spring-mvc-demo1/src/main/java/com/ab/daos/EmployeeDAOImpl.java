package com.ab.daos;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.ab.models.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public int insertEmployee(Employee employee) {
		
		int i = jdbcTemplate.update("INSERT into employee(id,name) VALUES(?,?)",new Object[] {employee.getId(),employee.getName()});
		
		return i;
	}

	@Override
	public List<Employee> findEmployee() {
	
		return jdbcTemplate.query("SELECT * from employee",(rs,count)->new Employee(rs.getInt("id"), rs.getString("name")));
	}

	@Override
	public int deleteEmployee(int id) {

		int i = jdbcTemplate.update("DELETE from employee WHERE id = ?", new Object[] {id});
		
		return i;
	}
	
	

}
