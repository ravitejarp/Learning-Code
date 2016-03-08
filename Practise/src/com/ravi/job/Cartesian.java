package com.ravi.job;

import java.awt.geom.Point2D;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Cartesian {
	Point2D p1 = new Point2D.Double(Math.cos(90.0) * 1, Math.sin(45.0) * 1);
	Point2D p12 = new Point2D.Double();

	public static void main(String[] args) {
		String s = "   ()(   ";
		String[] split = s.split("");
		HashMap<String, Integer> map = new HashMap<>();

		for (String s1 : split) {
			if (map.get(s1) == null) {
				map.put(s1, 1);
			} else
				map.put(s1, map.get(s1) + 1);
		}
		Iterator<Entry<String, Integer>> iterator = map.entrySet().iterator();
		
		while (iterator.hasNext()) {
			Entry<String, Integer> next = iterator.next();
			System.out.println(next.getKey()+":"+next.getValue());
		}
	}
}
