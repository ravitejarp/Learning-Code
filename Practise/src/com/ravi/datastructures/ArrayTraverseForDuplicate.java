package com.ravi.datastructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ArrayTraverseForDuplicate {

	public static void main(String[] args) {
		int[] arr = { 5, 8, 7, 9, 0, 1, 5, 3, 4, 8, 2, 1, 2, 1, 8, 8, 8, 8 };
		List<Integer> list = new ArrayList<Integer>();
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		// for (int i = 0; i < arr.length; i++) {
		// for (int j = 0; j < arr.length; j++) {
		// if (arr[j] == arr[i]) {
		// if (map.get(arr[i]) != null
		// && !map.get(arr[i]).contains("" + j))
		// map.put(arr[i], map.get(arr[i]) + "," + j);
		// else
		// map.put(arr[i], j + "");
		//
		// }
		// }
		// }
		//
		// Set<Integer> keySet = map.keySet();
		// Iterator<Integer> iterator = keySet.iterator();
		// while (iterator.hasNext()) {
		// Integer next = iterator.next();
		// System.out.print(next + "\t");
		// System.out.print(map.get(next));
		// System.out.println();
		// }

		for (int i = 0; i < arr.length; i++) {
			if (list.indexOf(arr[i]) == -1) {
				list.add(arr[i]);
			} else {
				if (map.get(arr[i]) != null)
					map.put(arr[i], map.get(arr[i]) + "," + i);
				else
					map.put(arr[i], list.indexOf(arr[i]) + "," + i);
			}
		}

		Set<Integer> keySet = map.keySet();
		Iterator<Integer> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			Integer next = iterator.next();
			System.out.print(next + "\t");
			System.out.print(map.get(next));
			System.out.println();
		}

		//

	}
}
