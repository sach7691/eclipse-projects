package com.ab.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import com.ab.models.Person;

@Controller
@SessionAttributes("person")
public class HomeController {
	
	
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
    public String index1() {
		
		return "index1";
	}
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
    public ModelAndView index1(@RequestParam (value="firstName") String firstName,@RequestParam (value="lastName") String lastName,@RequestParam (value="email") String email,@RequestParam ("age") String age) {
		
    	Person p = new Person(firstName, lastName, email, age);
    	
		return new ModelAndView("index", "person", p);
		
		
	}
	
	@RequestMapping(value = "/index2", method = RequestMethod.GET)
    public String index2() {
		
		return "index2";
	}
	
	

}
