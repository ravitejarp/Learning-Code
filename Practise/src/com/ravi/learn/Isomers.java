package com.ravi.learn;

import java.util.HashMap;

public class Isomers {

	public static boolean isIsomer(String s1, String s2) {
		HashMap<Character, Character> isomerMap = new HashMap<Character, Character>();
		for (int i = 0; i < s1.length(); i++)
			isomerMap.put(s1.charAt(i), s2.charAt(i));

		

		
		for (int i = 0; i < s1.length(); i++) {
			if (!(isomerMap.get(s1.charAt(i)) == s2.charAt(i))) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		String s1 = "abcx";
		String s2 = "xyzg";
		if (s1.length() != s2.length()) {
			System.out.println("Strings are not isomers");
		} else {
			if (isIsomer(s1, s2))
				System.out.println("Strings are isomers");
			else
				System.out.println("Strings are not isomers");
		}
	}

}
