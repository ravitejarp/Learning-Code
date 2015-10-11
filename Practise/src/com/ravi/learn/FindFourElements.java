package com.ravi.learn;

public class FindFourElements {

	public static void getPair(int[] arr, int index) {
		for (int i = index; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (j != i) {
					for (int k = 0; k + j < arr.length - 1; k++)
						if (arr[j] + arr[j + k + 1] == arr[i] + arr[i + 1]) {
							System.out.println("Pair is:" + (k + "," + k + 1)
									+ (i + "," + i + 1));
						}
				}
			}

		}
	}

	public static void main(String[] args) {
		int[] arr = { 3, 4, 7, 1, 2, 9, 8 };
		for (int i = 0; i < arr.length; i++) {
			getPair(arr, i);
		}
	}

}
