package com.snkit.runnable.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExecutorsExampleDemo {

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(10);

		List<Future> futurelist = new ArrayList();

		for (int i = 0; i < 10; i++) {

			EmployeCallable callable = new EmployeCallable(new InputRequest(new String(i + " number")));

			futurelist.add(service.submit(callable));
		}

		futurelist.forEach(future -> {

			try {

				System.out.println("  multiple future  value ====" + future.isDone());
				System.out.println("  multiple future  value ====" + ((Employe) future.get()).getTraceId());
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("   from exception ");
			}
		});

	}

}
