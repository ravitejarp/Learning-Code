package com.ravi.fileoperations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("Sample.txt");
		try {
			FileWriter fw = new FileWriter(f);
			PrintWriter pw = new PrintWriter(fw);
			pw.write("Ravi");
			pw.write("Teja");
			pw.flush();
			pw.close();
			fw.close();
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String value;
			while ((value = br.readLine()) != null)
				System.out.println(value);
			System.out.println(System.console());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
