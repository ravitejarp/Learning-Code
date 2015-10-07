package com.ravi.job;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ReplaceBadToGood {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		File f = new File("sample.txt");
		BufferedReader br = new BufferedReader(new FileReader(f));
		String line;
		String value = "abc";
		String toValue = "ravi";
		ArrayList<String> listOfArray = new ArrayList<String>();
		while ((line = br.readLine()) != null) {
			listOfArray.add(line);
		}
		
		/*for (String s : listOfArray) {
			String[] splitted = s.split("/");
			for(int i=0;i<splitted.length;i++)
			{
			splitted[i].replace("ravi", "abc");
			System.out.println(splitted[i]);
			}
		}*/

		ArrayList<String> copy = (ArrayList<String>) listOfArray.clone();
		
		Iterator<String> itr = listOfArray.iterator();
		while(itr.hasNext())
		{
			String contet = itr.next();
			/*if(contet.contains(value))
			{
				contet.replace
				System.out.println(contet);
			}*/
			
		}
		
	}

}
