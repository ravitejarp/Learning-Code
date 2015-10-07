package com.ravi.job;

public class YieldRunnable implements Runnable{

	public void run()
	{
		System.out.println("The current thread is "+Thread.currentThread().getName()+" & Priority is "+Thread.currentThread().getPriority());
		
		Thread.yield();
		
		System.out.println("The current thread is "+Thread.currentThread().getName()+" and has ended"+" Priority is "+Thread.currentThread().getPriority());
	}
	
	
}
