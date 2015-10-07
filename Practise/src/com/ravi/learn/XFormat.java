package com.ravi.learn;

public class XFormat {

	public static void printTheNumbers(int[] arr) {
		int value = 0;
		int first = 0;
		for (int i = 0; i <= arr.length / 2; i++) {
			if (i < arr.length / 2) {
				first = arr.length / 2;
				while (first < arr.length / 2 + i) {
					System.out.print("\t");
					first++;
				}
				System.out.print(arr[i]);
				value = first;
				while (value < arr.length + 3 - i) {
					System.out.print("\t");
					value++;
				}
				System.out.print(arr[arr.length - i - 1]);
				System.out.println();
			} else {
				int other = arr.length / 2;
				while (other > 0) {
					System.out.print("\t");
					other--;
				}
				System.out.print(arr[i]);
				System.out.println();
			}
		}
		int loopCounter = 1;
		for (int i = arr.length / 2 + 1; i < arr.length; i++) {
			int looper = arr.length / 2;
			int loop = looper - loopCounter;
			int tab = 2 * loopCounter;
			while (loop > 0) {
				System.out.print("\t");
				loop--;
			}
			System.out.print(arr[i]);
			loopCounter++;

			while (tab > 0) {
				System.out.print("\t");
				tab--;
			}
			System.out.print(arr[arr.length - i - 1]);
			System.out.println();
		}

	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		printTheNumbers(arr);

	}

}
