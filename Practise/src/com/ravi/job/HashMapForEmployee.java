package com.ravi.job;

import java.util.HashMap;
import java.util.Map;

public class HashMapForEmployee {

	public static void main(String[] args) {
		HashMap<Integer,String> hashMapObject = new HashMap<Integer,String>();

		Employee emp1 = new Employee("Ravi", "Teja", 12, 35461.98);
		Employee emp2 = new Employee("RSV", "Prasad", 11, 33461.98);
		Employee emp3 = new Employee("Ravu", "Sar", 14, 354561.98);
		Employee emp4 = new Employee("R", "Sowm", 112, 354541.98);

		hashMapObject.put(emp1.getEmpid(),emp1.toString());
		hashMapObject.put(emp2.getEmpid(),emp2.toString());
		hashMapObject.put(emp3.getEmpid(),emp3.toString());
		hashMapObject.put(emp4.getEmpid(),emp4.toString());

		for (Map.Entry<Integer, String> entry:hashMapObject.entrySet())
			System.out.println(entry.getValue());

	}

}
