package com.ravi.datastructures;

import java.util.HashMap;

public class HashMapDemo {

	int[] integerArray = { 12, 23, 34, 12, 34, 5 };

	public HashMap<Integer, Integer> buildMap() {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (Integer i : integerArray) {
			map.put(i, i);
		}
		return map;
	}

	public static void main(String args[]) {
		HashMapDemo hmd = new HashMapDemo();

		hmd.buildMap();
	}

}
