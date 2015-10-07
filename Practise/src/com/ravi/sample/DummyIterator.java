package com.ravi.sample;

import java.util.ArrayList;
import java.util.Iterator;

public class DummyIterator {

	static String x = null;

	public static void main(String[] args) {

		x = "Ravi";
		if (x == null) {
			System.out.println("HI");
		} else {
			System.out.println("Not null");
		}

		String xy = null;
		xy = sample();
		if (xy == null) {
			System.out.println("Ola");
		}

		System.out.println(x.equals(xy));

		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(213);
		al.add(12143);
		Iterator<Integer> itr = al.iterator();
		while (itr.hasNext()) {
			Integer remove = al.remove(0);
			System.out.println(remove);

		}

	}

	private static String sample() {

		return "";
		// TODO Auto-generated method stub

	}
}
