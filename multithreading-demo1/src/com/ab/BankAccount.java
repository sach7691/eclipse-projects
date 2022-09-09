package com.ab;

public class BankAccount implements Runnable {
	
	
	private int balance = 1000;
	
	private int withdraw;
	
	

	public BankAccount(int withdraw) {
		super();
		this.withdraw = withdraw;
	}

	@Override
	public synchronized void run() { //use synchronized keyword to avoid race condition otherwise First and Second transaction both enter to the critical section which leads to data inconsistency
		 
		if(balance >= withdraw) {
			System.out.println(Thread.currentThread().getName());
			System.out.println(Thread.currentThread().getName()+" Withdraw is : " + this.withdraw);
			
			balance = balance - withdraw;
			
			
		}
		else {
			System.out.println(Thread.currentThread().getName());
			System.out.println("Insufficient Funds!!");
		}
	}

}
