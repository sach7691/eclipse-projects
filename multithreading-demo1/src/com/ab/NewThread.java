package com.ab;

public class NewThread extends Thread{
	
	private int counter;
	
	@Override
	public void run(){ //Entry-point for new thread execution
		
		for(int i=1; i<=10; i++) {
			
			counter++;
		}
		System.out.println(Thread.currentThread().getName()); //Child Thread 1
		//System.out.println("New Thread is running.....");
		
	}
	
	public int getCounter() {
		
		return this.counter;
			
	}

}
