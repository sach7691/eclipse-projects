package com.ab;

import java.util.concurrent.Callable;

public class NewCallable implements Callable<String>{

	@Override
	public String call() throws Exception {
		
		return "Hello";
				
	}

}
