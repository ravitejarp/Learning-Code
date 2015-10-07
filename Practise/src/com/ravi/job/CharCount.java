package com.ravi.job;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

public class CharCount {

	public static void main(String[] args) throws IOException {
		String input;
		int flag = 0;
		String highest = null;
		System.out.println("Please key in data");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		input = br.readLine();
		StringTokenizer sb = new StringTokenizer(input);
		List<String> arrau = new ArrayList<String>();
		while (sb.hasMoreElements()) {
			arrau.add(sb.nextToken());
		}

		Iterator<String> itr = arrau.iterator();

		while (itr.hasNext()) {

			String c = itr.next();
			if (flag == 0)
				highest = c;
			else if (!(highest.length() > c.length())) {
				highest = c;
			}

		}

		System.out.println("These highest length is:" + highest.length());
	}
}
