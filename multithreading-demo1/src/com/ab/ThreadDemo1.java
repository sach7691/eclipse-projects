package com.ab;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ThreadDemo1 {

	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {


//		Thread t1 = Thread.currentThread(); //method of thread class is used to return a reference to the currently executing thread object, It returns the currently executing thread.
//		
//		//t1.setName("Sachini");	
//		//t1.setPriority(10);
//		
//		//System.out.println(t1.getName());
//		//System.out.println(Thread.currentThread().getName());
//		
//		
//		NewThread nt = new NewThread(); //NEW State
//		
//		nt.setName("Child Thread 1");
//		
//        NewThread2 nt2 = new NewThread2(); //NEW State
//		
//		nt2.setName("Child Thread 2");
//		//System.out.println(nt.getState());
//		
//		nt.start(); //Moves NEW to READY state
//		nt2.start();
//		
//		//System.out.println(nt.getState());
//			
//		try {
//			
//	 	  nt.join();   //Main thread waits for child thread 1 dies
//	 	
//		}catch(InterruptedException e) {
//			System.out.println(e);
//		}
//		
//		System.out.println("Counter value is : " + nt.getCounter());
		
//==================================Runnable======================================================
		
//		BankAccount act = new BankAccount(1000);
//		
//		//we have to create a thread when using Runnable and inject the BankAccount object reference
//		
//		Thread t1 = new Thread(act);
//		
//		Thread t2 = new Thread(act);
//		
//		t1.setName("First Transaction");
//		
//		t2.setName("Second Transaction");
//		
//		t1.start();
//		
//		t2.start();
		
//====================================Callable====================================================
		
		Callable c1 = new NewCallable(); //Polymophic way used
		Callable c2 = new NewCallable();
		Callable c3 = new NewCallable2();
		
		//to execute/run callable we need ExecutorService
		
		ExecutorService es =Executors.newFixedThreadPool(4);
		
		Future<String> result1 = es.submit(c1); //submit method result in Future
		
		Future<String> result2 = es.submit(c2);
		
		Future<Long> result3 = es.submit(c3);
		
		es.shutdown();
		
		System.out.println(result1.get());
		System.out.println(result2.get());
		System.out.println(result3.get(5,TimeUnit.SECONDS));
		

	}

}
