package com.ab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class SpringBootDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDiscoveryServerApplication.class, args);
	}

}
