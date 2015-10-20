package com.ravi.job;

import java.util.Arrays;
import java.util.HashMap;

public class SellBuy {

	public static void main(String[] args) {
		int[] costs = { 9, 4, 12, 5, 7, 2, 23, 22, 3, 5, 29, 1 };
		int key = 1;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i : costs) {
			map.put(i, key++);
		}

		Arrays.sort(costs);

		for (int i = 0, j = costs.length - 1; i < costs.length; i++) {
			if (map.get(costs[i]) < map.get(costs[j])) {
				System.out.println("Day to buy:" + map.get(costs[i])
						+ "\tCost:" + costs[i]);
				System.out.println("Day to Sell:" + map.get(costs[j])
						+ "\tCost:" + costs[j]);
				break;
			}
		}
	}
}
