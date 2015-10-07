package com.ravi.fileoperations;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		File f = new File("Keywords to remember.txt");
		System.out.println(f.exists());
		boolean newFile = f.createNewFile();
		System.out.println(newFile);
		System.out.println(f.exists());

	}

}
