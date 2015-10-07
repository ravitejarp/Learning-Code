package com.ravi.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class MissingNumbers {

	public static void main(String[] args) {

		TreeSet<String> listOfNumbers = new TreeSet<String>();

		listOfNumbers.add("Line-1:This is Raviteja");
		listOfNumbers.add("Line-4:This isa samall sample");
		listOfNumbers.add("Line-500:Missing");
		listOfNumbers.add("Line-600:Biscuit");
		listOfNumbers.add("Line-90:Hello ");

		MissingNumbers m = new MissingNumbers();
		m.getMissing("Line-0", "Line-500", listOfNumbers);

	}

	public void getMissing(String string, String string2,
			TreeSet<String> listOfIntegers) {

		String start = string;

		String[] firstArray = string.split("-");
		String[] endArray = string2.split("-");

		int firstValue = Integer.parseInt(firstArray[1]);
		int endValue = Integer.parseInt(endArray[1]);
		int next = 0;

		Iterator<String> iter = listOfIntegers.iterator();
		for (int i = firstValue; i <= endValue; i++) {
			if (iter.hasNext()) {

				String[] splittheCurrentValue = iter.next().split(":");

				int compareTo = start.compareTo(splittheCurrentValue[0]);

				if (compareTo < 1) {
					String[] splittheCounter = start.split("-");

					int starting = Integer.parseInt(splittheCounter[1]);

					String[] splitToGetTheValue = splittheCurrentValue[0]
							.split("-");
					next = Integer.parseInt(splitToGetTheValue[1]);

					for (int j = starting + 1; j < next; j++) {
						System.out.println("Missing:" + splitToGetTheValue[0]
								+ j);
					}

					start = splitToGetTheValue[0] + "-" + splitToGetTheValue[1];

				}
				i = next;
			}

			else {
				System.out.println("Missing:" + firstArray[0] + "-" + i);
			}
		}

	}
}
