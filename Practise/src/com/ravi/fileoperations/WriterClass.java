package com.ravi.fileoperations;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriterClass {

	public static void main(String[] args) throws IOException {
		char[] inData = new char[50];
		int size = 0;
		File f = new File("testWriter.txt");
		System.out.println(f.createNewFile());
		FileWriter fw = new FileWriter(f);
		fw.write("Hi Welcome to your sample code");
		fw.flush();
		fw.close();
		FileReader fr = new FileReader(f);
		size  = fr.read(inData);
		for(char c:inData)
			System.out.print(c);
		fr.close();

	}

}
