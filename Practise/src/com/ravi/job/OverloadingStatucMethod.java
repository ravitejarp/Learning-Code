package com.ravi.job;

public class OverloadingStatucMethod {

	static void sample()
	{
		System.out.println("Inside sample non overload");
	}
	
	static int sample(int x,int y)
	{
		return x;
	}

	public static void main(String[] args) {
		
		OverloadingStatucMethod osm = new OverloadingStatucMethod();
		osm.sample();
		System.out.println(osm.sample(1, 2));
	}

}
