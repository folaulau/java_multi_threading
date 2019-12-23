package com.folaukaveinga.thread_local;

import java.util.concurrent.atomic.AtomicInteger;

public class UserThreadLocal extends Thread {

	private static final AtomicInteger id = new AtomicInteger(0);

	ThreadLocal<String> privateName = ThreadLocal.withInitial(() -> " John--" + id.incrementAndGet());

	@Override
	public void run() {
		super.run();
		System.out.println("run..." + privateName.get());
	}
}
