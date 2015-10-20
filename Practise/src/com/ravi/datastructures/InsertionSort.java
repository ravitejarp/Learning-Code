package com.ravi.datastructures;

public class InsertionSort {

	public static void main(String args[]) {
		int[] arr = { 77, 99, 44, 55, 22, 88, 11, 00, 66, 33 };
		int[] insertionSort = insertionSort(arr);
		for (int a : insertionSort) {
			System.out.println(a);
		}
	}

	/**
	 * @param arr
	 * @return
	 */
	private static int[] insertionSort(int[] arr) {
		int in;
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			in = i;
			while (in > 0 && arr[in - 1] >= temp) {
				arr[in] = arr[in - 1];
				--in;
			}
			arr[in] = temp;
		}
		return arr;
	}
}
