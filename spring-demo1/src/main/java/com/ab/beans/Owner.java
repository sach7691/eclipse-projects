package com.ab.beans;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Owner {
	
	private String ownerName;
	
	@Autowired
    @Qualifier("Pet")
	private List<Pet> pets;
	
	public Owner() {
		super();
	}

	public Owner(String ownerName, List<Pet> pets) {
		super();
		this.ownerName = ownerName;
		this.pets = pets;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public void setPets(List<Pet> pets) {
		this.pets = pets;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public List<Pet> getPets() {
		return pets;
	}

	@Override
	public String toString() {
		return "Owner [ownerName=" + ownerName + ", pets=" + pets + "]";
	}
	

}
