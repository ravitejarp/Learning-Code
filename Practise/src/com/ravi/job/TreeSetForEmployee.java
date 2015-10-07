package com.ravi.job;

import java.util.TreeSet;

public class TreeSetForEmployee {

	public static void main(String[] args) {
		TreeSet<Employee> treeSetObject = new TreeSet<Employee>();

		Employee emp1 = new Employee("Ravi", "Teja", 12, 35461.98);
		Employee emp2 = new Employee("RSV", "Prasad", 11, 33461.98);
		Employee emp3 = new Employee("Ravu", "Sar", 14, 354561.98);
		Employee emp4 = new Employee("R", "Sowm", 112, 354541.98);
		
		treeSetObject.add(emp1);
		treeSetObject.add(emp2);
		treeSetObject.add(emp3);
		treeSetObject.add(emp4);
		
		for(Employee e : treeSetObject)
			System.out.println(e);
		

	}

}
