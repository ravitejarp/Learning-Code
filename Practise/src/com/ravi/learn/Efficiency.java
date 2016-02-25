package com.ravi.learn;

public class Efficiency {
	public static void main(String[] args) {
	}

	public static void testData(int n,int m) {
		if (n < 5) {
			System.out.println("Ha ha");
		} else {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) 
					System.out.println("Test");
				System.out.println("Test");
			}
			for (int i = 0; i < m; i++) {
				System.out.println("Test");
			}
			for (int i = 0; i < 50; i++) {
				System.out.println("Test");
			}
			for (int i = 0; i < 80; i++) {
				System.out.println("Test");
			}
		}
	}
}
