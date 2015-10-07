package com.ravi.job;

public class ReplaceInteger {

	public int replace(int input) {
		if (input == 0) {
			return 0;
		}
		int digit = input % 10;
		if (digit == 0)
			digit = 5;
		System.out.println(input);
		return replace(input / 10) * 10 + digit;
	}

	public static void main(String[] args) {
		ReplaceInteger rp = new ReplaceInteger();
		System.out.println((115 / 10) * 10 + 15);
		//System.out.println(rp.replace(105));

	}

}
