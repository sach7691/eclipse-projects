package com.ab;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ab.beans.Owner;
import com.ab.beans.Pet;
import com.ab.configs.springConfig;

@SpringBootApplication
public class SpringDemo1Application {

	public static void main(String[] args) {
		
	SpringApplication.run(SpringDemo1Application.class, args);
		
		
	ApplicationContext context = new AnnotationConfigApplicationContext(springConfig.class);
		
		Pet x = (Pet)context.getBean("p1");
		
		Owner y = (Owner)context.getBean("owner3");
		
		System.out.println(y);
		
	}

}
