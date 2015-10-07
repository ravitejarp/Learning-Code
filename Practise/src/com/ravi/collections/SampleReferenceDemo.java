package com.ravi.collections;

class Parenr1 {
	public void shape() {
		System.out.println("Parent");
	}
}

class Child1 extends Parenr1 {
	@Override
	public void shape() {
		System.out.println("In child 1");
	}
}

class Child2 extends Parenr1 {
	@Override
	public void shape() {
		System.out.println("In child 2");
	}
}

public class SampleReferenceDemo {

	public static void main(String[] args) {
		Parenr1 p = new Child1();
		Parenr1 p2 = new Child2();

	}

}
