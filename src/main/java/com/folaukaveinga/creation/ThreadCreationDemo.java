package com.folaukaveinga.creation;

public class ThreadCreationDemo {

	public static void main(String[] args) {
		Thread userThread = new Thread(new UserRunnable());
		userThread.start();
		
		MemberThread memberThread = new MemberThread();
		memberThread.start();
	}

}
