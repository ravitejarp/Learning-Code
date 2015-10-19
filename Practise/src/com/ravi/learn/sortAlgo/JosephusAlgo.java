package com.ravi.learn.sortAlgo;

import java.util.ArrayList;

public class JosephusAlgo {

	public static int josephus(int n, int k) {
		if (n == 1)
			return 1;
		else
			/*
			 * The position returned by josephus(n - 1, k) is adjusted because
			 * the recursive call josephus(n - 1, k) considers the original
			 * position k%n + 1 as position 1
			 */
			return (josephus(n - 1, k) + k - 1) % n + 1;
	}

	public static void main(String[] args) {
		System.out.println(josephus(10, 2));
		
		ArrayList<String> a = new ArrayList<String>();
		

	}

}
