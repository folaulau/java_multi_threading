package com.folaukaveinga.synchronization;

public class MemberThread extends Thread {

	private int count;
	
	@Override
	public void run() {
		super.run();
		count++;
		System.out.println("running MemberThread..."+Thread.currentThread().getName()+", count: "+count);
	}
}
