package com.ravi.learn;

public class Matrix {

	public static void main(String[] args) {
		int[][] arr = { { 0, 1, 1, 0, 1 }, { 0, 0, 0, 0, 0 },
				{ 1, 1, 1, 0, 0 }, { 1, 1, 1, 1, 0 }, { 1, 1, 1, 1, 1 } };
		for (int i = 0, k = 0; i < arr.length; i++) {
			boolean flag = false;
			boolean flag1 = false;
			while (0 == arr[i][k]) {
				if (++k >= arr.length) {
					flag = true;
					break;
				} else {
					if (k == i)
						k++;
					flag = false;
				}
			}
			if (flag) {
				k = 0;
				while (1 == arr[k][i]) {
					if (++k >= arr.length) {
						flag1 = true;
						break;
					} else {
						if (k == i)
							k++;
						flag1 = false;
					}
				}
			}
			if (flag1) {
				System.out.println("Value is:" + arr[i][i]+"Index:"+i+","+i);
				break;
			}
			int j = i;
			if (++j >= arr.length) {
				System.out.println("Value is not:" + -1);
			}
		}
	}
}
