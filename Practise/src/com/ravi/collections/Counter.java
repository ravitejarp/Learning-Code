package com.ravi.collections;

import java.util.HashMap;

public class Counter {
	public static void main(String[] args) {
		Counter c = new Counter();
		// c.cl
		System.out.println(getTheCount("abba.#$bcbdbabdbdbabababcbcbab"));
	}

	public static HashMap<Character, Integer> getTheCount(String count) {
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < count.length(); i++) {
			if (map.containsKey(count.charAt(i))) {
				map.put(count.charAt(i), map.get(count.charAt(i)) + 1);
			} else {
				map.put(count.charAt(i), 1);
			}
		}
		return map;
	}
}
