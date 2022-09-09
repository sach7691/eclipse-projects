package com.ab.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ab.models.Student;
import com.ab.repositories.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	
	
	@Autowired
	private StudentRepository studentRepository;
	
	

	@Override
	public Student saveStudent(Student s) {
	
		return studentRepository.save(s);
	}

	@Override
	public List<Student> loadAllStudents() {
		
		return studentRepository.findAll();
	}

	@Override
	public Optional<Integer> updateByEmail(int id,String email) {
	
		return studentRepository.updateByEmail(id, email);
	}

	@Override
	public int deletebyId(int id) {
		
		 studentRepository.deleteById(id);
		 
		 return 1;
	}

}
