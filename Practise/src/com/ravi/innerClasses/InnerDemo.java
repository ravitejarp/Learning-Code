package com.ravi.innerClasses;

import com.ravi.innerClasses.InnerDemo.InnerClass;

public class InnerDemo {
	private int x = 10;

	public void createObject() {
		 InnerClass ic = new InnerClass();
		 ic.innerClassMethodToPrint();
	}

	public class InnerClass {

		int x = 200;

		InnerClass() {

		}

		public void innerClassMethodToPrint() {
			System.out.println(x);
			System.out.println(InnerDemo.this.x);
			System.out.println(this.x);

		}

		public void m1() {

		}

	}

	public static void main(String args[]) {
		InnerDemo icd = new InnerDemo();
		 InnerDemo.InnerClass iccd = icd.new InnerClass();
		 iccd.innerClassMethodToPrint();
		 
		 InnerDemo.InnerClass inner = new InnerDemo().new InnerClass();
		// Sample s = new InnerDemo().new Sample();
		// s.innerClassMethodToPrint();

		icd.createObject();
	}

	class Sample extends InnerClass {
	}
}
