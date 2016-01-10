//package com.ravi.factorydp;
//
//public class DatabaseFactory {
//	static {
//
//	}
//
//	public static IDatabase getDatabase() throws InstantiationException,
//			IllegalAccessException, ClassNotFoundException {
//		// TODO Auto-generated method stub
//		String dbName = readFromConfig("database-name");
//		IDatabase newInstance = (IDatabase) Class.forName(dbName).newInstance();
//		return newInstance;
//
//	}
//
//	private static String readFromConfig(String string) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//}
