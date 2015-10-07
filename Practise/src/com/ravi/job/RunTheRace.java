package com.ravi.job;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class RunTheRace implements Runnable {

	ThreadGroup threadGroup = new ThreadGroup("Dummy");
	Thread threadSample = new Thread("Dummy Thread");

	@Override
	public void run() {
		for (int i = 1; i <= 4; i++) {
			System.out.println(Thread.currentThread().getName()
					+ " is running.");
			if (i == 2) {

				threadGroup = Thread.currentThread().getThreadGroup();
				threadSample = Thread.currentThread();
				// System.out.println(Runner.hashMapForThreads.get(threadSample));
				getKey(threadGroup, threadSample);

				System.out.println(Thread.currentThread().getName()
						+ " Is running.");

			}
		}
	}

	public void getKey(ThreadGroup valueForThreadGroup,
			Thread valueForCurrentThread) {
		Set<Thread> keys = Runner.hashMapForThreads.keySet();
		Iterator itr = keys.iterator();
		Thread key = null;

		while (itr.hasNext()) {
			key = (Thread) itr.next();
			if (Runner.hashMapForThreads.containsValue(valueForThreadGroup)
					&& valueForCurrentThread.getName() != key.getName()) {
				Thread th = (Thread) itr.next();
				th.start();
			}

		}

	}

}
