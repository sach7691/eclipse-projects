package com.ab.beans;
import org.springframework.stereotype.Component;

@Component
public class Pet {
	
	
	private String petName;
	
	public Pet() {
		super();
	}

	public Pet(String petName) {
		super();
		this.petName = petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public String getPetName() {
		return petName;
	}

	@Override
	public String toString() {
		return "Pet [petName=" + petName + "]";
	}
	

}
