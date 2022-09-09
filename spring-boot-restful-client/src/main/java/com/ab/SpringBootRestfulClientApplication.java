package com.ab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringBootRestfulClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestfulClientApplication.class, args);
	}

}
