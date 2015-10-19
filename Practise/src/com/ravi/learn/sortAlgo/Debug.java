package com.ravi.learn.sortAlgo;

public class Debug {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 15;

		if (n % 2 == 0) {
			System.out
					.println("Even number found, please give odd number. Exiting the program");
			System.exit(1);
		}

		int mid_num = (n + 1) / 2;

		for (int i = 1; i <= mid_num; i++) {

			for (int j = 1; j <= i - 1; j++)
				System.out.print(" ");

			System.out.print(i);

			for (int space = 1; space <= 2 * mid_num - 2 * i - 1; space++)
				System.out.print(" ");

			if (i != mid_num)
				System.out.print(n + 1 - i);

			System.out.println();

		}

		for (int i = 1; i <= mid_num - 1; i++) {

			for (int j = 1; j <= mid_num - i - 1; j++)
				System.out.print(" ");

			System.out.print(mid_num - i);

			for (int j = 1; j <= 2 * i - 1; j++)
				System.out.print(" ");

			System.out.print(mid_num + i);

			System.out.println();

		}

	}

}
