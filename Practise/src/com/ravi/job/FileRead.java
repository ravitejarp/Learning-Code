package com.ravi.job;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class FileRead {

	public static void main(String[] args) throws IOException {
		File f = new File("sample.txt");

		String line;
		if (f.exists()) {
			System.out.println("File exists and reading the file");
			BufferedReader br = new BufferedReader(new FileReader(f));
			List<String> list = new ArrayList<String>();
			while ((line = br.readLine()) != null) {
				String[] str = line.split("/");
				list.add(str[0]);
			}

			for (String s : list) {
				System.out.println(s);
			}

		}

	}

}
