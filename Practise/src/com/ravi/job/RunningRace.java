package com.ravi.job;

import java.util.HashMap;

public class RunningRace {

	static Thread t1;
	static Thread t2;
	static Thread t3;
	static Thread t4;
	static Thread t5;
	static Thread t6;
	static Thread t7;
	static Thread t8;
	static Thread t9;
	static Thread t10;

	static HashMap<Thread, ThreadGroup> groupArray = new HashMap<Thread, ThreadGroup>();

	public static void main(String[] args) {
		RunningState rs = new RunningState();
		ThreadGroup tg1 = new ThreadGroup("TG1");
		ThreadGroup tg2 = new ThreadGroup("TG2");
		ThreadGroup tg3 = new ThreadGroup("TG3");
		ThreadGroup tg4 = new ThreadGroup("TG4");
		ThreadGroup tg5 = new ThreadGroup("TG5");

		t1 = new Thread(tg1, rs, "Runner1");
		t2 = new Thread(tg1, rs, "Runner2");

		t3 = new Thread(tg2, rs, "Runner3");
		t4 = new Thread(tg2, rs, "Runner4");

		t5 = new Thread(tg3, rs, "Runner5");
		t6 = new Thread(tg3, rs, "Runner6");

		t7 = new Thread(tg4, rs, "Runner7");
		t8 = new Thread(tg4, rs, "Runner8");

		t9 = new Thread(tg5, rs, "Runner9");
		t10 = new Thread(tg5, rs, "Runner10");

		groupArray.put(t1, tg1);
		groupArray.put(t2, tg1);
		groupArray.put(t3, tg2);
		groupArray.put(t4, tg2);
		groupArray.put(t5, tg3);
		groupArray.put(t6, tg3);
		groupArray.put(t7, tg4);
		groupArray.put(t8, tg4);
		groupArray.put(t9, tg5);
		groupArray.put(t10, tg5);

	}

}
