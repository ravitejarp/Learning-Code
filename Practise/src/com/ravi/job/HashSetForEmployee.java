package com.ravi.job;

import java.util.HashSet;

public class HashSetForEmployee {

	public static void main(String[] args) {

		HashSet<Employee> hashEmpObject = new HashSet<Employee>();

		Employee emp1 = new Employee("Ravi", "Teja", 12, 35461.98);
		Employee emp2 = new Employee("RSV", "Prasad", 11, 33461.98);
		Employee emp3 = new Employee("Ravu", "Sar", 14, 354561.98);
		Employee emp4 = new Employee("R", "Sowm", 112, 354541.98);

		hashEmpObject.add(emp1);
		hashEmpObject.add(emp2);
		hashEmpObject.add(emp3);
		hashEmpObject.add(emp4);
		
		
		for(Employee emp:hashEmpObject)
		System.out.println(emp);

	}

}
