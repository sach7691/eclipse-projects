package com.ab.configs;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.ab.beans.Owner;
import com.ab.beans.Pet;

@Configuration
public class springConfig {
	
	ArrayList<Pet> pets = new ArrayList<>();
	
	@Bean
	public List<Pet> petList() {
	
		pets.add(new Pet("Dog"));
		pets.add(new Pet("Cat"));
		pets.add(new Pet("Rabbit"));
		
		return pets;
	}
		
	
	@Bean
	
	public Pet p1() {
			
	  return new Pet("Dog");
			
	}

	@Bean
	@Qualifier("Pet")
	public Pet p2() {
			
	  return new Pet("Cat");
			
	}
	
	@Bean
	public Pet p3() {
			
	  return new Pet("Rabbit");
			
	}
	
	@Bean
	public Owner owner1() {
			
	  return new Owner("Sachini",pets);
			
	}
	
	@Bean
	public Owner owner2() {
			
	  return new Owner("Sasika",pets);
			
	}
	
	@Bean
	public Owner owner3() {
			
	  return new Owner("Sajani",pets);
			
	}

	
}


