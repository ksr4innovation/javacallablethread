package com.snkit.synchronize;

public class SynchronizedMethodDemoMultitpleObject {
	public static void main(String[] args) {
		SynchronizedMethodDemoExample smd = new SynchronizedMethodDemoExample("synchronizeddemoobject1");

		Thread t = new Thread(new Runnable() {

			public void run() {
				System.out.println("   From Run method ===== "+Thread.currentThread().getName());
				smd.show();
			}
		});

		t.start();
		SynchronizedMethodDemoExample smd2 = new SynchronizedMethodDemoExample("synchronizeddemoobject2");
		Thread t2 = new Thread(new Runnable() {

			public void run() {
				System.out.println("   From Run method ===== "+Thread.currentThread().getName());
				smd2.show();
			}
		});

		t2.start();

	}
	
}
