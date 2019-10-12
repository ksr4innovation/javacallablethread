package com.snkit.runnable.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class CallableThreadExampleDemo {

	public static void main(String[] args) {
	
		

		ExecutorService service = Executors.newFixedThreadPool(10);
		
		FutureTask[] randomNumberTasks = new FutureTask[10];

		for (int i = 0; i < 10; i++) {
			
			EmployeCallable callable = new EmployeCallable(new InputRequest(new String(i+" number")));
			
			randomNumberTasks[i] = new FutureTask(callable);
			Thread t = new Thread(randomNumberTasks[i]); 
		      t.start(); 
		}
		
		for (int i=0;i<randomNumberTasks.length;i++) {
			
				
				try {
					
					System.out.println("  multiple future  value ====" + randomNumberTasks[i].isDone());
					System.out.println("  multiple future  value ====" + ((Employe)randomNumberTasks[i].get()).getTraceId());
				} catch (InterruptedException | ExecutionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("   from exception " );
				}
			
		}
		
		
	
	}

}
