package com.ravi.job;

public class OnlyStatcOverload {

	static void sample() {
		System.out.println("Inside sample non overload");
	}

	public static void main(String[] args) {

		OverloadingStatucMethod osm = new OverloadingStatucMethod();
		osm.sample();
		Sample s = new Sample();
		s.sample();
	}

}

class Sample extends OnlyStatcOverload
{
	static void sample()
	{
		int x=10;
		System.out.println(x);
	}
}