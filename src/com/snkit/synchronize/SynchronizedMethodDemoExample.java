package com.snkit.synchronize;

public class SynchronizedMethodDemoExample {
	
	private String name;
	
	public SynchronizedMethodDemoExample(String input){
		this.name = input;
	}

	
	public synchronized void show() {
		System.out.println("  from synchronixed method  before sleep  "+Thread.currentThread().getName()+"  Object name value === "+this.name);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("  from synchronixed method  after sleep "+Thread.currentThread().getName()+"  Object name value === "+this.name);
	}
	
	
	public static synchronized void staticShow() {
		System.out.println("  from synchronixed method  before sleep  "+Thread.currentThread().getName()+"  Object name value === ");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("  from synchronixed method  after sleep "+Thread.currentThread().getName()+"  Object name value === ");
	}
}
