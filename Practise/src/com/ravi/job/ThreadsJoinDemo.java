package com.ravi.job;

import java.lang.Thread.State;

public class ThreadsJoinDemo {
	static Thread t1;
	static Thread t2;

	public static void main(String[] args) {
		JoinSample js = new JoinSample();

		ThreadGroup tg = new ThreadGroup("Sample");

		t1 = new Thread(tg, js, "First Thread");

		t2 = new Thread(tg, js, "Second Thread");

		t1.start();

		while (true) {
			State s1 = t1.getState();
			State s2 = t2.getState();

			System.out
					.println("Current state of:" + t1.getName() + " is " + s1);
			System.out
					.println("Current state of:" + t2.getName() + " is " + s2);

			if (s1.equals(State.TERMINATED) && s2.equals(State.TERMINATED))
				break;

		}

	}

}
