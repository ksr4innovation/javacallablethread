package com.snkit.runnable.thread;

public class RunnableDemoThread {

	public static void main(String[] args) {
	
		
		for (int i=0;i<1000;i++) {
			Thread t = new Thread(new MyTask());
			t.start();
		}

		
		System.out.println("   from Runnable Demo Thread example ======= ");
	}

}
