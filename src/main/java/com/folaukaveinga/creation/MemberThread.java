package com.folaukaveinga.creation;

public class MemberThread extends Thread {

	@Override
	public void run() {
		super.run();
		System.out.println("running MemberThread..."+Thread.currentThread().getName());
	}
}
