package com.snkit.runnable.thread;

import java.util.UUID;
import java.util.concurrent.Callable;

public class EmployeCallable implements Callable<Employe>  {
	InputRequest request;
	
	
	public EmployeCallable(InputRequest inputRequest) {
		this.request = inputRequest;
	}

	public Employe call() throws Exception {
		
		System.out.println(Thread.currentThread().getName()+"  before thread sleeep ");
		Thread.sleep(3000);
		System.out.println(Thread.currentThread().getName()+"  after   sleeep ");
		return new Employe(UUID.randomUUID().toString()+"   input "+this.request.getAccountNumber());

	}

}
