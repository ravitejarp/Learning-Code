package com.ravi.job;

public class StaticAndRefrence {

	static void sample() {
		System.out.println("Ssample in Base");
	}

	void test() {
		System.out.println("Test in Base");
	}

	public static void main(String[] args) {
		StaticAndRefrence sr = new StaticAndRefrence();
		System.out.println("SR Object and refernce");
		sr.sample();
		sr.test();
		System.out.println("Child Object and refernce");
		ChildClass cs = new ChildClass();
		cs.sample();
		cs.test();
		System.out.println("Child Object and Parent refernce");
		StaticAndRefrence csp = new ChildClass();
		csp.sample();
		csp.test();
		System.out.println("Child object and Parent refernce");
		StaticAndRefrence psc = new ChildClass();
		psc.sample();
		psc.test();
		
	}

}

class ChildClass extends StaticAndRefrence {
	static void sample() {
		System.out.println("Sample in Derived class");
	}

	void test() {
		System.out.println("TEst in chid class");
	}
}
