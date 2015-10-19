package com.ravi.learn.sortAlgo;

public class RemoveElements {

	public static int[] removeElements(int[] arr, int counter, int index) {

		int[] arrLatest = null;
		int i = 0;
		if (arr[index] + 1 == arr[index + 1]
				&& arr[index + 2] == arr[index + 1] + 1) {
			int latestIndex = index + 3;
			for (int k = latestIndex; k < arr.length; k++) {
				arrLatest[i++] = arr[k];
			}
			return arrLatest;
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 5, 6, 4 };
		int k = 1;
		for (int i = 0; i < arr.length; i++) {
			removeElements(arr, k, i);
		}
	}

}
