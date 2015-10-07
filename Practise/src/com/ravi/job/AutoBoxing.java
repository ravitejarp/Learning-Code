package com.ravi.job;

public class AutoBoxing {

	public static void main(String[] args) {
		Integer y = 990, x = 990;
		if(x==y)
		{
			System.out.println("Same");
		}
		else if(x.equals(y))
		{
			System.out.println("Equals");
		}
		else
		{
			System.out.println("Not same");
		}

	}

}
