package com.ravi.ocjp;

import com.ravi.ocjp.ProtectedDemo;

public class ProtectedDemoWithInPackage extends ProtectedDemo {
	int parent = 18;
	Thread t = new Thread();

	@Override
	public void test() {
		System.out.println("In child");
		System.out.println(parent);
	}

	public static void main(String[] args) {
		ProtectedDemo parent = new ProtectedDemo();
		ProtectedDemoWithInPackage child = new ProtectedDemoWithInPackage();
		ProtectedDemo child1 = new ProtectedDemoWithInPackage();
		System.out.println("Parent");
		parent.test();
		System.out.println(parent.parent);
		System.out.println("Child");
		child.test();
		System.out.println(child.parent);
		System.out.println("Child1");
		child1.test();
		System.out.println(child1.parent);

	}
}
