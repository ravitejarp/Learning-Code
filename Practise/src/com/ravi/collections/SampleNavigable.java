package com.ravi.collections;

import java.util.TreeSet;

public class SampleNavigable {

	public static void main(String[] args) {
		TreeSet<Integer> tree = new TreeSet<Integer>();
		tree.add(1202);
		tree.add(1234);
		tree.add(1409);
		TreeSet<Integer> set = (TreeSet<Integer>) tree.headSet(1400);
		System.out.println(set.last());

	}

}
