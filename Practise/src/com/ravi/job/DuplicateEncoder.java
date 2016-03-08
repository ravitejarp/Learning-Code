package com.ravi.job;

import java.util.HashMap;

public class DuplicateEncoder {
	static String encode(String word) {
		String[] split = word.toLowerCase().split("");
		String newWord = "";
		HashMap<String, Integer> map = new HashMap<>();
		for (String s : split) {
			if (map.get(s) == null) {
				map.put(s, 1);
			} else
				map.put(s, map.get(s) + 1);
		}
		for (String s1 : split) {
			if (map.get(s1) > 1)
				newWord = newWord + ")";
			else
				newWord = newWord + "(";
		}
		System.out.println(newWord);
		return newWord;
	}

	public static void main(String[] args) {
		DuplicateEncoder.encode("   ()(   ");
		
	}
}
