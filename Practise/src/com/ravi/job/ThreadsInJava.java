package com.ravi.job;

public class ThreadsInJava implements Runnable {

	public static void main(String[] args) {
		ThreadsInJava thread = new ThreadsInJava();
		thread.start(thread);
	}
	

	public void start(ThreadsInJava th) {
		Thread t1 = new Thread(th,"t1");
		t1.run();

		Thread t2 = new Thread(th,"t2");
		t2.run();

		Thread t3 = new Thread(th,"t3");
		t3.run();

		Thread t4 = new Thread(th,"t4");
		t4.run();

	}

	@Override
	public void run() {

		System.out.println("Thread Running");

	}

}
