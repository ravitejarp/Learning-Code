package com.ravi.datastructures;

public class Person {
	String name;

	public Person(String personName) {
		name = personName;
	}

	public String greet(String yourName) {
		return String.format("Hi %s, my name is %s", name, yourName);
	}

	public static void main(String[] args) {
		Person p = new Person("Ravi");
		System.out.println(p.greet("Teja"));
	}
}