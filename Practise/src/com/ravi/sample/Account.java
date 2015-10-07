package com.ravi.sample;

import java.io.Serializable;

public class Account implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int x;
	transient int y;

	public void readObject(int y) {

	}
}
