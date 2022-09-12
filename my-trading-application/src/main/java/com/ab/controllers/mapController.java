package com.ab.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mapController {
	
	@GetMapping("/stock/{name}")
	public String chart() {
		
		return "chart"; 
	}

}
