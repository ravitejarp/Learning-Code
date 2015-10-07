package com.ravi.job;

public class Brain {

	Brain() {
		System.out.println("Thinking..");
	}

	public static void main(String[] args) {

	}

}

class Person {
	private Brain brian;
	Person(Brain brain)
	{
		this.brian = brian;
	}

}