package com.ravi.learn;

public class BinaryHeapImpl {

	public static void main(String[] args) {
		int arr[] = { 90, 15, 10, 7, 12, 2 };
		boolean flag = true;
		int j = 0;
		for (int i = 0; i < arr.length - 1; i = i + 3) {
			int k = i + 2;
			j = i;

			int temp = arr[i];
			if (!(temp > arr[++j] && temp > arr[k])) {
				System.out.println("Not a b tree");
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("Its a binary tree");
		}

	}
}
