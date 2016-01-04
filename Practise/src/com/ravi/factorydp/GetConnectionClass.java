package com.ravi.factorydp;

public class GetConnectionClass {
public static void main(String[] args) {
	IDatabase database = DatabaseFactory.getDatabase();
}
}
