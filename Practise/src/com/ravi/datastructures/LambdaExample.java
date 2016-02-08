package com.ravi.datastructures;

import java.util.function.Function;

public class LambdaExample {
	public static void sample() {
		Function<TreeNode, Object> f = p -> p.data;
		System.out.println(f.apply(new TreeNode<String>("Ravi")));
	}
	

	public static void main(String[] args) {
		LambdaExample.sample();
	}
}
