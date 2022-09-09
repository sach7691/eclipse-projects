package com.ab.controllers;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class StudentClientController {

	@Autowired
	private RestTemplate restTemplate;
	
	//http://localhost:8083/template/Student
	@GetMapping("/template/Student")
	public String  loadAllStudentRecords() {
		
		HttpHeaders headers = new HttpHeaders();
		
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		
		ResponseEntity<String> respose = restTemplate.exchange("http://spring-jpa-restful1/Student",HttpMethod.GET,entity,String.class);
		
		return respose.getBody(); //ResponseEntity returns status code, headers, and body. 
	}
	
	
}
