package com.ravi.learn.sortAlgo;

public class RainDrops {

	public static int getQuantity(int[] arr) {
		int rightlarge = arr[0];
		int leftlarge = arr[arr.length - 1];
		int arrTotal = 0;
		int leftIndex = 0;
		int rightIndex = 0;

		for (int i = 1; i < arr.length; i++) {

			rightlarge = (arr[i] > rightlarge) ? arr[i] : rightlarge;
		}

		for (int i = arr.length - 1; i >= 0; i--) {

			if (arr[i] != 0)
				leftlarge = (leftlarge < arr[i]) ? leftlarge : arr[i];

		}

		System.out.println("Right:" + rightlarge);
		System.out.println("Left:" + leftlarge);
		int total = (leftlarge + rightlarge) * (arr.length - 2);

		for (int k = 0; k < arr.length; k++) {
			arrTotal += arr[k];
		}
		arrTotal = arrTotal - leftlarge - rightlarge;
		total -= arrTotal;

		return total;

	}

	public static void main(String[] args) {
		System.out.println(getQuantity(new int[] { 3, 0, 0, 2, 0, 4 }));
	}
}
