package com.ravi.job;

public class JoinSample implements Runnable {

	public void run() {
		System.out.println("Thread execution started");
		System.out.println("Current thread is:"
				+ Thread.currentThread().getName());
		if(Thread.currentThread().getName().equals("First Thread"))
		{
			ThreadsJoinDemo.t2.start();
			try {
				ThreadsJoinDemo.t2.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
				
	}
}
