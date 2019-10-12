package com.snkit.synchronize;

public class SynchronizedMethodDemoOneObject {

	public static void main(String[] args) {
		SynchronizedMethodDemoExample smd = new SynchronizedMethodDemoExample("synchronizeddemo");

		Thread t = new Thread(new Runnable() {

			public void run() {
				System.out.println("   From Run method ===== "+Thread.currentThread().getName());
				smd.show();
			}
		});

		t.start();

		Thread t2 = new Thread(new Runnable() {

			public void run() {
				System.out.println("   From Run method ===== "+Thread.currentThread().getName());
				smd.show();
			}
		});

		t2.start();

	}
	
	
	

}
