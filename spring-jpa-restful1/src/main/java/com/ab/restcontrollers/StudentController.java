package com.ab.restcontrollers;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ab.models.Student;
import com.ab.services.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/Student")
	public Student saveStudent(@RequestBody Student student) {
		
		return studentService.saveStudent(student);	
	}
	
	
	@GetMapping("/Student")
	public List<Student> getAllStudents() {
		
		return studentService.loadAllStudents();
		
	}
	
	@PutMapping("/Student")
	public Optional<Integer> updateEmailByID(@RequestBody Student student){
		
		return studentService.updateByEmail(student.getId(), student.getEmail());
	}

	@DeleteMapping("/Student/{id}")
	public int deleteById(@PathVariable("id") int id) {
		return studentService.deletebyId(id);
		
	}
}
