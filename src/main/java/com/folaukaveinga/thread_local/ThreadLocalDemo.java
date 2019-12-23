package com.folaukaveinga.thread_local;

import java.util.Arrays;
import java.util.List;

public class ThreadLocalDemo {

	public static void main(String[] args) {
		
		List<UserThreadLocal> threads = Arrays.asList(new UserThreadLocal(),new UserThreadLocal(),new UserThreadLocal());

		threads.forEach(mem -> {
			mem.run();
		});

		threads.stream().forEach(thread -> {
			try {
				thread.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
	}

}
