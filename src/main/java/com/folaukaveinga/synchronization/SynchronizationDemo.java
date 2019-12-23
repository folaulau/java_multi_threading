package com.folaukaveinga.synchronization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizationDemo {

	public static void main(String[] args) {
		List<Integer> ids = new CopyOnWriteArrayList<>(Arrays.asList(0));
		Counter counter = new Counter();

		List<MemberThread> threads = Arrays.asList(new MemberThread("mem1", ids, counter),
				new MemberThread("mem2", ids, counter), new MemberThread("mem3", ids, counter),
				new MemberThread("mem4", ids, counter));

		threads.forEach(mem -> {
			mem.start();
		});

		threads.stream().forEach(thread -> {
			try {
				thread.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		System.out.println("counter: " + counter.getCounter());
		System.out.println("ids: " + ids.toString());

//		MemberThread mem1 = new MemberThread();
//		mem1.setName("mem1");
//		mem1.start();

	}
}
