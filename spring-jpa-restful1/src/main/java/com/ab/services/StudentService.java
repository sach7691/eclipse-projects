package com.ab.services;

import java.util.List;
import java.util.Optional;

import com.ab.models.Student;


public interface StudentService {
	
	public Student saveStudent(Student s);
	public List<Student> loadAllStudents();
	public Optional<Integer> updateByEmail(int id,String email);
	public int deletebyId(int id);

}
