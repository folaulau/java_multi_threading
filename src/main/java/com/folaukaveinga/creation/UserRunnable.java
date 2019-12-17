package com.folaukaveinga.creation;

public class UserRunnable implements Runnable {

	public UserRunnable() {
		super();
		System.out.println("UserRunnable..."+Thread.currentThread().getName());
	}

	@Override
	public void run() {
		System.out.println("running UserRunnable.."+Thread.currentThread().getName());
	}

}
