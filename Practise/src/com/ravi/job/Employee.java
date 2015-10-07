package com.ravi.job;

public class Employee implements Comparable<Employee> {

	private String firstName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	private String lastName;
	private int empid;
	private double salary;

	Employee(String firstName, String lastName, int empid, double d) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.empid = empid;
		this.salary = d;

	}

	public String toString() {
		return "Employee " + this.firstName + " " + this.lastName
				+ " and employee id is " + this.empid + " has salary "
				+ this.salary;
	}

	@Override
	public int compareTo(Employee o) {

		return this.lastName.compareTo(o.lastName);
	}

}
