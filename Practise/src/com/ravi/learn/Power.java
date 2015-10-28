package com.ravi.learn;

import java.math.BigInteger;

public class Power {

	public static BigInteger powerFinder(BigInteger x) {
		if (x.intValue() > 0) {
			BigInteger reducingValue = new BigInteger("1");
			x = x.subtract(reducingValue);
			BigInteger bi = new BigInteger("2");
			return bi.multiply(powerFinder(x));
		}
		return BigInteger.valueOf(2);
	}

	public static void main(String[] args) {
		for (long i = 0; i <= 1000; i++) {
			System.out.println(i + "-->" + powerFinder(BigInteger.valueOf(i)));
			System.out.println();
			System.out.println();
		}

	}
}
