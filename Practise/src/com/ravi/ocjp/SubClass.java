package com.ravi.ocjp;

public class SubClass extends SuperClass {
	public void getSuperClass() {
		getSuper();
	}

	public void getSuperWithRef() {
		SuperClass s = new SuperClass();
		s.getSuper();
	}
}
