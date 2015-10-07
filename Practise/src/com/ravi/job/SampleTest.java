package com.ravi.job;

public class SampleTest {

	public int returnValue(int x) {
		if (x == 1) {
			x++;
		} else if (x == 2) {
			x--;
		}
		return x;
	}

	public static void main(String[] args) {
		SampleTest st = new SampleTest();
		System.out.println(st.returnValue(1));
		System.out.println(st.returnValue(2));

	}

}
