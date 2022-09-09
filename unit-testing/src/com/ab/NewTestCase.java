package com.ab;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class NewTestCase {
	
	private Calculator c1;
	
	@BeforeEach
	void setUp() {
		
		c1 = new Calculator();
		
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

	@Test
	@Disabled
	void test1() {		
		
	}
	

	@Test
	void test2() {		
		
		assertEquals(100, 200);
		
	}
	
	@Test
	void test3() {		
				
		//Act
		int actualValue = c1.add(100,200);
		
		int expectedValue = 300;
		
		//verify
		assertEquals(expectedValue, actualValue);
		
	}
}
