package com.ravi.job;

import java.util.function.Function;

public class Student {
	private String firstName;
	private String lastName;
	public String studentNumber;

	public String getFullName() {
		return firstName + " " + lastName;
	}

	public String getCommaName() {
		return lastName + ", " + firstName;
	}

	public boolean checkTheName(String name, String number) {
		Function<Student, Boolean> f = p -> {
			if (p.getFullName() == "John Smith" && p.studentNumber == "js123")
				return true;
			return false;
		};
		
		int a = 1/2 * 5 * 10;
		Student s = new Student();

		return false;
	}
}