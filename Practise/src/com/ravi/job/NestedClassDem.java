package com.ravi.job;

public class NestedClassDem {
	static int x = 10;
	final int y = 10;

	static class NewClass {
		int y = 11;

		void sample() {
			x++;
			System.out.println("x is:" + x);
			System.out.println("y is:" + y);
		}
		void test()
		{
			y++;
			System.out.println("y is:" + y);
		}
	}

	class NewNonNestedClass {
		void sample() {
			int y = 12;
			System.out.println("x is:" + x);
			System.out.println("y is:" + y);
		}
		void test()
		{
			System.out.println("y is:"+y);
		}
	}

	public static void main(String args[]) {
		
		NestedClassDem.NewClass nnc = new NestedClassDem.NewClass();
		NestedClassDem outer = new NestedClassDem();
		NestedClassDem.NewNonNestedClass nns = outer.new NewNonNestedClass();
		nns.sample();
		nnc.sample();
		nns.test();
		nnc.test();
	}
}
