package com.ravi.learn;

public class NoLooper {

	public int printTheDecrement(int value) {
		if (value > 0) {
			value = value - 5;
			System.out.println(value);
			return printTheDecrement(value);
		}
		return value;
	}

	public int printTheIncrement(int value, int original) {
		if (value != original) {
			value = value + 5;
			System.out.println(value);
			return printTheIncrement(value, original);
		}
		return value;
	}

	public static void main(String[] args) {
		NoLooper nlObject = new NoLooper();
		System.out.println(16);
		int value = nlObject.printTheDecrement(16);
		nlObject.printTheIncrement(value, 16);

	}

}
