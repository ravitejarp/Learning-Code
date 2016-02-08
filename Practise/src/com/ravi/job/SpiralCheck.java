package com.ravi.job;

public class SpiralCheck {
	int col = 0;
	int row = 0;

	public void printTheApiralMatrix(int[][] array) {
		if (row < array.length) {
			if (col < array[row].length) {
				System.out.print(array[row][col] + " ");
				col++;
				printTheApiralMatrix(array);
			} else {
				row++;
				col--;
				printTheApiralMatrix(array);
			}
		} else {
			row--;
			printTheApiralMatrix(array);
		}
	}

	public void printInSpiral(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.println();
			}
		}
	}

	public void inEff(int[][] array) {
		for (int i = 0; i < array.length; i++) {

		}
	}

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 },
				{ 13, 14, 15, 16 } };
		SpiralCheck sc = new SpiralCheck();
		sc.printTheApiralMatrix(arr);
	}
}
