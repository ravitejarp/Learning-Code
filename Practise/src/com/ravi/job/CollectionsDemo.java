package com.ravi.job;

import java.util.ArrayList;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {
		ArrayList<Integer> listA = new ArrayList<Integer>();
		listA.add(12);
		listA.add(345);
		listA.add(45);
		listA.add(35);
		listA.add(34);
		listA.add(3445);

		// System.out.println(listA.get(0));

		for (int i = 0; i < listA.size(); i++) {
			System.out.println(listA.get(i));
		}

		// listA.remove(0);
		listA.remove(listA.size() - 1);

		for (Integer value : listA)
			System.out.println(value);
		// System.out.println(listA.get(0));

		List<String> listOfValues = new ArrayList<String>();
	}

}
