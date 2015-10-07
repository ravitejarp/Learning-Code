package com.ravi.learn;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.Set;

public class ReadAndWriteCsv {
	File f = null;

	@SuppressWarnings("resource")
	public HashMap<String, String> read() {
		String value;
		HashMap<String, String> map = new HashMap<String, String>();
		BufferedReader br = null;
		try {
			f = new File("data.txt");
			br = new BufferedReader(new FileReader(f));
			while ((value = br.readLine()) != null) {
				String[] split = value.split(",");
				map.put(split[0], split[1]);
			}
		} catch (IOException e) {
			System.out.println("Issue in reading the file");

		} finally {
			try {
				br.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		return map;
	}

	public void write() {
		BufferedWriter bw = null;
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("QOS1", "12.098");
		map.put("QOS2", "122.1323");
		map.put("QOS3", "123454");
		map.put("QOS4", "122");
		map.put("QOS5", "1242");
		map.put("QOS6", "1243");
		map.put("QOS7", "123");
		map.put("QOS8", "124");
		map.put("QOS19", "412");
		map.put("QOS0", "112");
		try {
			f = new File("./data.txt");
			bw = new BufferedWriter(new FileWriter(f));
			Set<String> keySet = map.keySet();
			Iterator<String> iterator = keySet.iterator();
			while (iterator.hasNext()) {
				String next = iterator.next();
				bw.write(next);
				bw.append(",");
				bw.append(map.get(iterator.next()));
				bw.append("\n");
			}
			System.out.println("Write Success");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			try {
				bw.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		ReadAndWriteCsv rw = new ReadAndWriteCsv();
		rw.write();
	}

}
