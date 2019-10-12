package com.snkit.runnable.thread;

public class MyTask implements Runnable {
	
	public void run() {
		System.out.println("  From runnable thread"+Thread.currentThread().getName());
		
		try {
			Thread.sleep(100000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("  From runnable after sleep  thread"+Thread.currentThread().getName());
	}

}
