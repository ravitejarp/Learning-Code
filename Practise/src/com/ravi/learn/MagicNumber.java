package com.ravi.learn;

public class MagicNumber {

	public static int magicNumber(long num) {
		int sum = 5;
		int i = 2;
		while (num > 0) {
			sum += Math.pow(5, i);
			i++;
			num--;
		}

		return sum;
	}

	public static void main(String[] args) {
		System.out.println(magicNumber(2));
	}

}
