package com.ravi.collections;

class Parent {
	public void m1() {
		System.out.println("Parent");
	}

	public void m2() {
		System.out.println("P");
	}

}

class Parent1 extends Parent {
	public void m1() {
		System.out.println("Parent 1");
	}
}

public class CDemo extends Parent1 {

	/*
	 * public void m1() { System.out.println("Parent 22"); }
	 */

	public static void main(String[] args) {
		Parent p1 = new CDemo();
		p1.m1();
		p1.m2();
		Parent1 p2 = new CDemo();
		p2.m1();
		p2.m2();

		CDemo p3 = new CDemo();
		p3.m1();

	}
}
