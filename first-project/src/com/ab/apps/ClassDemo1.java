package com.ab.apps;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.ab.models.Student;

public class ClassDemo1 {

	public static void main(String[] args) {


		Student s1 = new Student(1, "Sachini");
		Student s2 = new Student(2, "Tom");
		Student s3 = new Student(3, "Sam");
		Student s4 = new Student(4, "Dan");
		
		
		
//		List<Student> students = new ArrayList<>();
		
		List<Student> students = Arrays.asList(s1, s2, s3,s4);
		
//		students.add(s1);
//		students.add(s2);
//		students.add(s3);
//		students.add(s4);
		
		System.out.println(students);

		
		
		
		
		
		
		
	}

}
