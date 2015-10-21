package com.ravi.collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueImpl {

	static class PQ implements Comparator<Integer> {

		@Override
		public int compare(Integer o1, Integer o2) {
			// TODO Auto-generated method stub
			return o2 - o1;
		}

	}

	public static void main(String[] args) {
		PQ comparator = new PQ();
		PriorityQueue<Integer> pQ = new PriorityQueue<Integer>(comparator);
		System.out.println(pQ.isEmpty());
		pQ.offer(12);
		pQ.offer(1);
		pQ.offer(122);
		pQ.offer(128);
		pQ.offer(124);
		pQ.offer(129);

		Iterator<Integer> iterator = pQ.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next().intValue());
		}

		System.out.println("Peek:" + pQ.peek());
		System.out.println(pQ.isEmpty());

		System.out.println(pQ.comparator().toString());

	}

}
