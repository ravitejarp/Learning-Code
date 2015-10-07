package com.ravi.collections;

import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;

public class SubMapDemo {

	public static void main(String[] args) {
		TreeMap<String, String> map = new TreeMap<String, String>();
		map.put("Ravi", "Software");
		map.put("RaviTeja", "Doctor");
		map.put("a", "ad");
		map.put("b", "ad");
		map.put("q", "ad");
		map.put("w", "ad");
		map.put("r", "ad");
		map.put("y", "ad");

		SortedMap<String, String> ss = map.subMap("a", "c");

		// ss.headMap(toKey)

	}

}
