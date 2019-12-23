package com.folaukaveinga.synchronization;

public class Counter {

	private int counter;

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public synchronized void incrementCounter(int value) {
		this.counter += value;
	}

}
