package com.ravi.job;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Runner {
	static Thread t1;
	static Thread t2;
	static Thread t3;
	static Thread t4;
	static Thread t5;
	static Thread t6;
	static Thread t7;
	static Thread t8;
	static String currentThreadName;
	static ThreadGroup tg1;
	static ThreadGroup tg2;
	static ThreadGroup tg3;
	static ThreadGroup tg4;

	static HashMap<Thread, ThreadGroup> hashMapForThreads = new HashMap<Thread, ThreadGroup>();

	public static void main(String[] args) {
		RunTheRace runn = new RunTheRace();
		tg1 = new ThreadGroup("India");
		tg2 = new ThreadGroup("China");
		tg3 = new ThreadGroup("Nepal");
		tg4 = new ThreadGroup("Sri Lanka");

		t1 = new Thread(tg1, runn, "T1");
		t2 = new Thread(tg1, runn, "T2");
		t3 = new Thread(tg1, runn, "T3");
		t4 = new Thread(tg1, runn, "T4");
		t5 = new Thread(tg1, runn, "T5");
		t6 = new Thread(tg1, runn, "T6");
		t7 = new Thread(tg1, runn, "T7");
		t8 = new Thread(tg1, runn, "T8");

		hashMapForThreads.put(t1, tg1);
		hashMapForThreads.put(t2, tg1);

		hashMapForThreads.put(t3, tg2);
		hashMapForThreads.put(t4, tg2);

		hashMapForThreads.put(t5, tg3);
		hashMapForThreads.put(t6, tg3);

		hashMapForThreads.put(t7, tg4);
		hashMapForThreads.put(t8, tg4);

		t1.start();
		/* t2.start(); */
		t3.start();
		// t4.start();
		t5.start();
		// t6.start();
		t7.start();
		// t8.start();

	}
}
