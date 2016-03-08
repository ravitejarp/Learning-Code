package com.ravi.job;

public class IndexedNumber {

	public int getTheIndex(int[] arr, int n) {
		for (int i = 1; i < arr.length; i += 3) {
			System.out.println("I is:" + i);
			if (arr[i - 1] == n) {
				return i;
			} else if (arr[i] == n) {
				return i + 1;
			} else if (arr[i + 1] == n) {
				return i + 2;
			} else {
				if (n - arr[i + 1] > 3) {
					if (i + 3 < arr.length)
						i = i + 3;
				}
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 0, -1, -2, -3, -2, -1, 0, 1, 2, 3, 2, 3, 2, 3, 4, 5, 6 };
		System.out.println(new IndexedNumber().getTheIndex(arr, 6));
		System.out.println(new IndexedNumber().getTheIndex(arr, 1));
	}

}
