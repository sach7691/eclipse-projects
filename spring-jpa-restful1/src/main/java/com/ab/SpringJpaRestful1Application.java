package com.ab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringJpaRestful1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaRestful1Application.class, args);
	}

}
