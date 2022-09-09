package com.ab;

public class NewThread2 extends Thread{
	
	@Override
	public void run(){ //Entry-point for new thread execution
		
	
		System.out.println(Thread.currentThread().getName()); //Child Thread 2

		
	}

}
