package com.ravi.learn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LongestPath {

	public static String recursiveCaller(int[][] arr, int row, int col) {

		if (row + 1 != arr.length && arr[row][col] + 1 == arr[row + 1][col]) {
			return arr[row][col] + "-" + recursiveCaller(arr, row + 1, col);
		}

		else if (col + 1 != arr.length
				&& arr[row][col] + 1 == arr[row][col + 1]) {
			return arr[row][col] + "-" + recursiveCaller(arr, row, col + 1);
		}

		else if (row - 1 != -1 && arr[row][col] + 1 == arr[row - 1][col]) {
			return arr[row][col] + "-" + recursiveCaller(arr, row - 1, col);
		}

		else if (col - 1 != -1 && arr[row][col] + 1 == arr[row][col - 1]) {
			return arr[row][col] + "-" + recursiveCaller(arr, row, col - 1);
		} else {

			return "" + arr[row][col];
		}

	}

	public static void main(String[] args) {
		List<String> finalList = new ArrayList<String>();
		int length = 0;
		String path = "";
//		 int[][] arr = { { 1, 2, 3 },
//				 		{ 3, 5, 4 },
//				 		{ 4, 6, 7 } };
		int[][] arr = { { 1, 2, 9 },
						{ 5, 3, 8 },
						{ 4, 6, 7 } };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				finalList.add(recursiveCaller(arr, i, j));
			}
		}

		Iterator<String> iterator = finalList.iterator();
		while (iterator.hasNext()) {
			String next = iterator.next();
			if (next.length() > length) {
				length = next.length();
				path = next;
			}
		}
		System.out.println(path);
	}
}
