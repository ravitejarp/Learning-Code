package com.ravi.ocjp1;

import com.ravi.ocjp.ProtectedDemo;

public class ProtectedDemo1 extends ProtectedDemo {
	int parent = 18;

	@Override
	protected void test() {
		System.out.println("In child");
		System.out.println(parent);
	}

	public static void main(String[] args) {
		ProtectedDemo parent = new ProtectedDemo();
		ProtectedDemo1 child = new ProtectedDemo1();
		ProtectedDemo child1 = new ProtectedDemo1();
		System.out.println("Parent");
		// parent.test();
		System.out.println("Child");
		child.test();
		System.out.println(child.parent);
		System.out.println("Child1");
		// child1.test();

	}
}
