package com.ravi.learn.sortAlgo;

public class XYFormar {

	public static void printTheNumbers(int[] arr) {
		int value = arr.length / 2;
		int first = 0;
		int secondLoop = 0;
		for (int i = 0; i <= arr.length / 2; i++) {
			int counter = 0;
			if (i < arr.length / 2) {
				counter = first;
				while (counter > 0) {
					System.out.print("\t");
					counter--;
				}
				System.out.print(arr[i]);
				secondLoop = 2 * (value - first);
				while (secondLoop > 0) {
					System.out.print("\t");
					secondLoop--;
				}
				System.out.print(arr[arr.length - i - 1]);
				System.out.println();
				first++;
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
			System.out.print(arr[arr.length - i - 1]);
			loopCounter++;

			while (tab > 0) {
				System.out.print("\t");
				tab--;
			}
			System.out.print(arr[i]);
			System.out.println();
		}

	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16,
				17, 18, 19 };
		printTheNumbers(arr);

	}

}