package com.ravi.collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQDemo {
	static class PQ implements Comparator<Integer> {

		@Override
		public int compare(Integer arg0, Integer arg1) {
			return arg1 - arg0;
		}

	}

	public static void main(String[] args) {
		PriorityQueue<Integer> pp = new PriorityQueue<Integer>();
		int[] sample = { 1, 2, 3, 8, 4, 7 };
		for (int i : sample)
			pp.offer(i);
		System.out.println(36 / 6 * (2 + 2 + 2));
		System.out.println("==================================");

		/*
		 * Iterator<Integer> it = pp.iterator(); while (it.hasNext())
		 * System.out.print(it.next() + "\t");
		 */

		for (int i : sample)
			System.out.println(pp.poll());

		PQ pq = new PQ();
		PriorityQueue<Integer> pp1 = new PriorityQueue<Integer>(10, pq);

		for (int i : sample)
			pp1.offer(i);
		System.out.println("==================================");
		/*
		 * Iterator<Integer> it1 = pp.iterator(); while (it1.hasNext())
		 * System.out.print(it1.next() + "\t");
		 */

		/*
		 * for (int i : sample) System.out.println(pp1.poll());
		 */

		System.out.println("Size" + pp1.size());
		System.out.println("Peak" + pp1.peek());
		System.out.println("Size" + pp1.size());
		System.out.println("Poll" + pp1.poll());
		System.out.println("Peak" + pp1.peek());

		for (int i : sample)
			System.out.println(pp1.poll());

	}
}
