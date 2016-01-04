package com.ravi.job;

import java.util.HashMap;

public class FancyNumber {

	private static HashMap<Character, Character> map = new HashMap<Character, Character>();

	public FancyNumber() {
		map.put('6', '9');
		map.put('9', '6');
		map.put('1', '1');
		map.put('8', '8');
		map.put('0', '0');
	}

	public static void main(String[] args) {
		FancyNumber f = new FancyNumber();
		String number = "96";
		String dummy = "";
		for (int i = 0; i < number.length(); i++) {
			System.out.println(map.get(number.charAt(i)));
			if (map.get(number.charAt(i)) != null) {
				dummy = dummy + map.get(number.charAt(i));
			} else {
				System.out
						.println("No 180 degrees rotattion doesnt fecth the same result");
				System.exit(1);
			}

		}
		System.out.println(dummy);
		if (dummy.equals(number)) {
			System.out
					.println("Yes 180 degrees rotation fecth the same result");
		} else {
			System.out
					.println("No 180 degrees rotattion doesnt fecth the same result");
		}
	}
}
