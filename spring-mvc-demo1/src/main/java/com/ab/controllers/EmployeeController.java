package com.ab.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ab.models.Employee;
import com.ab.services.EmployeeService;

@Controller
public class EmployeeController {
	
	
	@Autowired
	private EmployeeService employeeService;
	
	//mapping methods
	
	@GetMapping("/")
	//http://localhost:8080/
	public String index() {
		
		return "index"; // represent "view name"/jsp file name
	}
	
	@GetMapping("/register")
	//http://localhost:8080/register
	public String register() {
		
		return "register"; // represent "view name"/jsp file name
	}
	
	
	@GetMapping("/employees")
	//http://localhost:8080/register
	public ModelAndView allEmployee() { //ModelAndView combine data and view together and send as represent
		
		ModelAndView mv = new ModelAndView();
		
		List<Employee> emp = employeeService.findEmployee();
		mv.addObject("empList",emp); //empList is a key/lookup
		
		mv.setViewName("employee_list");
		
		return mv; // represent "view name"/jsp file name
	}

	
	@RequestMapping(value ="/welcome",method = RequestMethod.GET) //another way of writing get method
	public String welcome() {
		
		return "welcome";
	}
	
//	@PostMapping("/register_process")
//	public String register(@RequestParam("id") int id,)
//	
	
	
	
	
}
