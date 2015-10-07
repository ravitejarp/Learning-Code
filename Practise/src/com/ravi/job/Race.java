package com.ravi.job;

public class Race {

	public static void main(String[] args) {
		Racer r = new Racer();
		Thread tort = new Thread(r, "T1");
		Thread rabb = new Thread(r, "T2");
		Thread rab1 = new Thread(r, "T3");
		Thread rab2 = new Thread(r, "T4");
		Thread rab3 = new Thread(r, "T5");
		Thread rab4 = new Thread(r, "T6");
		Thread rab5 = new Thread(r, "T7");
		Thread rab6 = new Thread(r, "T8");
		Thread rab7 = new Thread(r, "T9");
		Thread rab8 = new Thread(r, "T10");
		Thread rab9 = new Thread(r, "T11");
		tort.setPriority(10);
		tort.start();
		rabb.start();
		rab1.start();
		rab2.start();
		rab3.start();
		rab4.start();
		rab5.start();
		rab6.start();
		rab7.start();
		rab8.start();
		rab9.start();

	}

}
