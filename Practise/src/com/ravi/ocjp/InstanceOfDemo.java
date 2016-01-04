package com.ravi.ocjp;

public class InstanceOfDemo {

	public static void main(String[] args) {
		String s = "Raviteja";
		InstanceOfDemo t = new InstanceOfDemo();
		InstanceOfDemo t1 = new InstanceOfDemo();
		System.out.println(s instanceof String);
		System.out.println(s instanceof Object);
		System.out.println(t instanceof InstanceOfDemo);
		if (t.equals(t1)) {
			System.out.println("Equals");
		}
	}

}
