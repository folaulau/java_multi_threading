package com.folaukaveinga.synchronization;

import java.util.List;

public class MemberThread extends Thread {

	private List<Integer> ids;

	private Counter counter;
	
	MemberThread() {
		this(null, null,null);
	}

	MemberThread(String name, List<Integer> ids, Counter counter) {
		this.setName(name);
		this.ids = ids;
		this.counter = counter;
	}

	@Override
	public void run() {
		super.run();
		for (int i = 1; i <= 10; i++) {
			addId(i);
		}
		
		for (int i = 1; i <= 10; i++) {
			counter.incrementCounter(1);
		}
		//System.out.println("running MemberThread..." + Thread.currentThread().getName() + " - ids: " + ids.toString());

	}

	private void addId(Integer id) {
		ids.add(id);
	}

}
