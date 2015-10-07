package com.ravi.learn;

public class RainWater {

	public static int getQuantity(int[] arr) {
		int large = arr[0];
		int small = arr[0];
		int counter = 0;
		int total = 0;
		boolean flag = true;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != 0) {
				counter++;
				if (flag) {
					total += small * counter;
					counter = 0;
				} else {
					total += large * counter;
					counter = 0;
				}
				if (arr[i] > large) {
					large = arr[i];
					flag = true;
					continue;
				} else if (arr[i] < small) {
					total = total - small;
					flag = false;
					continue;
				}
			}

		}
		return total;
	}

	public static void main(String[] args) {
		System.out.println(getQuantity(new int[] { 3, 0, 0, 2, 0, 4 }));
	}
}
