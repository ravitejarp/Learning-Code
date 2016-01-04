package com.ravi.ocjp1;

public class OtherProtected extends ProtectedDemo1 {
	public static void main(String[] args) {
		ProtectedDemo1 pd1 = new ProtectedDemo1();
		pd1.test();
		OtherProtected op = new OtherProtected();
		System.out.println(op.parent);
		op.test();
		ProtectedDemo1 op1 = new OtherProtected();
		System.out.println(op1.parent);
		op1.test();
	}
}
