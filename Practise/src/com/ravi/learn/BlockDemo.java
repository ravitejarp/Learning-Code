package com.ravi.learn;

public class BlockDemo {

	static {
		System.out.println("Static block");
	}

	public BlockDemo() {
		System.out.println("In Constructor");
	}

	{
		System.out.println("Anonymous block");
	}
	{
		System.out.println("Second anonymous");
	}

	public static void main(String[] args) {
		BlockDemo b = new BlockDemo();
	}

	{
		System.out.println("Third anonymous");
	}
}
