package com.ravi.learn;

import java.util.Arrays;

public class MinimizeArray {

	public static int[] minimizeList(int[] arr, int number) {

		for (int i = 0; i < arr.length; i++) {

			if (i + 2 < arr.length && arr[i] + number == arr[i + 1]
					&& arr[i + 2] == arr[i + 1] + number) {
				arr = copyData(arr, i + 3);
				i = -1;

			}

		}
		return arr;
	}

	private static int[] copyData(int[] arr, int index) {
		return Arrays.copyOfRange(arr, index, arr.length);

	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 5, 6, 4 };
		int k = 1;
		int[] minimizeList = minimizeList(arr, k);
		for (int i : minimizeList)
			System.out.println(i);

	}

}
