package com.ravi.job;

import java.lang.Thread.State;

public class YieldExample {

	public static void main(String[] args) {
		YieldRunnable yr = new YieldRunnable();
		ThreadGroup allTreads = new ThreadGroup("All Threads");
		Thread t1 = new Thread(allTreads, yr, "Thread1");
		Thread t11 = new Thread(allTreads, yr, "Thread11");
		Thread t2 = new Thread(allTreads, yr, "Thread2");
		Thread t3 = new Thread(allTreads, yr, "Thread3");
		Thread t4 = new Thread(allTreads, yr, "Thread4");
		Thread t5 = new Thread(allTreads, yr, "Thread5");
		Thread t6 = new Thread(allTreads, yr, "Thread6");
		Thread t7 = new Thread(allTreads, yr, "Thread7");
		Thread t8 = new Thread(allTreads, yr, "Thread8");
		Thread t9 = new Thread(allTreads, yr, "Thread9");
		Thread t10 = new Thread(allTreads, yr, "Thread10");

		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);

		t4.setPriority(Thread.MIN_PRIORITY);
		t5.setPriority(Thread.MIN_PRIORITY);
		t6.setPriority(Thread.MIN_PRIORITY);

		t7.setPriority(Thread.NORM_PRIORITY);
		t8.setPriority(Thread.NORM_PRIORITY);
		t9.setPriority(Thread.NORM_PRIORITY);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t10.start();
		t11.start();

		while (true) {
			State s1 = t1.getState();
			State s2 = t2.getState();
			State s3 = t3.getState();
			State s4 = t4.getState();
			State s5 = t5.getState();

			State s6 = t6.getState();
			State s7 = t7.getState();
			State s8 = t8.getState();
			State s9 = t9.getState();
			State s10 = t10.getState();
			State s11 = t11.getState();

			System.out.println(System.nanoTime() + " t1 Status " + s1);
			System.out.println(System.nanoTime() + " t2 Status " + s2);
			System.out.println(System.nanoTime() + " t3 Status " + s3);

			System.out.println(System.nanoTime() + " t4 Status " + s4);
			System.out.println(System.nanoTime() + " t5 Status " + s5);
			System.out.println(System.nanoTime() + " t6 Status " + s6);
			System.out.println(System.nanoTime() + " t7 Status " + s7);
			System.out.println(System.nanoTime() + " t8 Status " + s8);
			System.out.println(System.nanoTime() + " t9 Status " + s9);
			System.out.println(System.nanoTime() + " t10 Status " + s10);
			System.out.println(System.nanoTime() + " t11 Status " + s11);
			
			
			int activeThreads = allTreads.activeCount();
			System.out.println("Active threads are:"+activeThreads);
			
			if(activeThreads==0)
				break;

		}

	}

}
