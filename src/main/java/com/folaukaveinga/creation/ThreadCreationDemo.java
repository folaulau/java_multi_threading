package com.folaukaveinga.creation;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadCreationDemo {

	public static void main(String[] args) {

		// runnable
		Thread userRunnable = new Thread(new UserRunnable());
		userRunnable.setName("userRunnable");
		userRunnable.start();

		// thread
		MemberThread memberThread = new MemberThread();
		memberThread.setName("memberThread");
		memberThread.start();

		// callable
		FutureTask<Integer> futureTask = new FutureTask<Integer>(new CustomerCallable());

		Thread customerCallableStart = new Thread(futureTask);
		customerCallableStart.setName("customerCallableStart");
		customerCallableStart.start();

		System.out.println("demo is done! - " + Thread.currentThread().getName());

		try {
			int result = futureTask.get();
			System.out.println("result: " + result);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
