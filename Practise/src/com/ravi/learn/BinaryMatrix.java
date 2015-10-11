package com.ravi.learn;

public class BinaryMatrix {

	public static boolean getTheRowNumber(int[][] arr, int index) {
		for (int i = 0; i < arr.length; i++) {
			if (i != index) {
				if (!(arr[i][index] == 1 && arr[index][i] == 0)) {
					return false;
				}
			}
		}

		return true;

	}

	public static void main(String[] args) {
		boolean flag = false;
		// int[][] arr = { { 1, 0, 0, 0 }, { 1, 1, 1, 0 }, { 1, 1, 0, 0 },
		// { 1, 1, 1, 0 }, };
		//
//		int[][] arr = { { 0, 1, 1, 0, 1 }, { 0, 0, 0, 0, 0 },
//				{ 1, 1, 1, 0, 0 }, { 1, 1, 1, 1, 0 }, { 1, 1, 1, 1, 1 } };

		int[][] arr = { { 0, 1, 1, 0, 1 }, { 0, 0, 0, 0, 0 },
				{ 1, 1, 1, 0, 0 }, { 1, 0, 1, 1, 0 }, { 1, 1, 1, 1, 1 } };
		for (int i = 0; i < arr.length; i++) {
			boolean theRowNumber = getTheRowNumber(arr, i);
			if (theRowNumber) {
				flag = true;
				System.out.println(i);
			} else if (!(i + 1 < arr.length) && !flag) {
				System.out.println(-1);
			}
		}
	}
}
