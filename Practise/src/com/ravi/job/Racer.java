package com.ravi.job;



import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Map;
import java.util.TreeMap;

public class Racer implements Runnable {

	private String winner;

	TreeMap<String,Integer> map1 = new TreeMap<String,Integer>(); 
	
	public void race() {
		/*DateFormat dF = new SimpleDateFormat("hh:mm:ss");
		Calendar cal = Calendar.getInstance();
		String time= dF.format(cal.getTime());*/
		for (int i = 1; i <= 100; i++) {
			System.out.println("Distance coverd by:"
					+ Thread.currentThread().getName() + " is " + i + " meters");

			boolean isRaceWon = isRaceWon(i);
			if (isRaceWon) {
				System.out.println(Thread.currentThread().getName()
						+ " has won the match");
			map1.put(Thread.currentThread().getName(),i );
				
				break;
			}
		}
		
		System.out.println("Results are:::");
		
		for(Map.Entry<String, Integer> e : map1.entrySet())
		{
			System.out.print(e.getKey()+"\t");
			System.out.print(e.getValue()+"\t");
			System.out.println();
		}
	}

	public boolean isRaceWon(int totalDistanceCovered) {
		if (totalDistanceCovered == 100) {
			winner = Thread.currentThread().getName();
			return true;
		}
		return false;
	}

	@Override
	public void run() {
		this.race();
		

	}

}
