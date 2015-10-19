package com.ravi.learn.sortAlgo;

public class StackClient {

	public static void main(String[] args) {
		int[] arr = { 5, 9, 5, 8, 4, 2, 4 };
		StackImpl s = new StackImpl(arr, 9);
		s.display();
		System.out.println(s.peek());
		s.display();
		System.out.println(s);
	}
}
