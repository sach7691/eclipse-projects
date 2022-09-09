package com.ab;

import java.util.concurrent.Callable;

public class NewCallable2  implements Callable<Long>{

	
	@Override
	public Long call() throws Exception {
		
		long sum = 0;
		
		for(int i = 0; i<= 200000; i++) {
			
			sum = sum+i;
		}
		

		return sum;
	}

}
