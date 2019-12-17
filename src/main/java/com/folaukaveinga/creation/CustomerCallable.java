package com.folaukaveinga.creation;

import java.util.concurrent.Callable;

public class CustomerCallable implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		System.out.println("calling CustomerCallable ..."+Thread.currentThread().getName());
		return 10;
	}

}
