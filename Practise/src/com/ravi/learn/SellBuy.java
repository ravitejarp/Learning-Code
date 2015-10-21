package com.ravi.learn;

import java.util.Arrays;
import java.util.HashMap;

public class SellBuy {

	public static void main(String[] args) {
		// int[] costs = { 1, 8, 30, 9, 4, 12, 5, 7, 2, 70, 23, 22, 3, 5, 29, 50
		// };

		int[] costs = { 70, 8, 30, 9, 4, 12, 5, 7, 2, 1, 23, 22, 3, 5, 29, 15 };

		int key = 1;
		int min = 0;
		int sellIndex = 0;
		int buyIndex = 0;

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i : costs) {
			map.put(i, key++);
		}

		Arrays.sort(costs);

		for (int i = 0, j = costs.length - 1; i < costs.length; i++) {
			if (map.get(costs[j]) == 1) {
				j--;
			}
			if (map.get(costs[i]) < map.get(costs[j])) {
				// System.out.println("Day to buy:" + map.get(costs[i])
				// + "\tcost:" + costs[i]);
				// System.out.println("Day to Sell:" + map.get(costs[j])
				// + "\tcost:" + costs[j]);
				if (costs[j] - costs[i] > min) {
					min = costs[j] - costs[i];
					System.out.println(min);
					sellIndex = j;
					buyIndex = i;
					j--;
					i = -1;
				}
			}

			if (j - 1 < 0)
				break;
		}
		System.out.println("Buy:" + costs[buyIndex] + "\tDay:"
				+ map.get(costs[buyIndex]));
		System.out.println("Sell:" + costs[sellIndex] + "\tDay:"
				+ map.get(costs[sellIndex]));
	}
}
