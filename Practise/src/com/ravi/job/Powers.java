package com.ravi.job;

import java.math.BigInteger;

public class Powers {
	public static BigInteger powers(int[] list) {

		BigInteger po = BigInteger.valueOf(1);
		for (int i = 0; i < list.length; i++) {
			po = po.multiply(BigInteger.valueOf(2));
		}

		return po;
	}

	public static int squareDigits(int n) {
		String s = String.valueOf(n);
		String newString = "";
		for (int i = 0; i < s.length(); i++) {
			int val = s.charAt(i) * s.charAt(i);
			newString = newString + String.valueOf(val);
		}

		return Integer.parseInt(newString);
	}

	public static void main(String[] args) {
		int[] a = { 1 };
		System.out.println(Powers.powers(a));
		System.out.println(1 % 10);
		System.out.println(Integer.parseInt("123456789"));
	}
}