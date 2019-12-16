package com.folaukaveinga.creation;

public class MemberThread extends Thread {

	@Override
	public void run() {
		super.run();
		System.out.println("run MemberThread...");
	}
	
	@Override
	public synchronized void start() {
		super.start();
		System.out.println("start MemberThread...");
	}
}
