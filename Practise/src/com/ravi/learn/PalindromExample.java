package com.ravi.learn;

public class PalindromExample {

	public static void main(String[] args) {
		String pali = "racecar";
		boolean flag = false;
		String[] split = pali.split(" ");
		for (int i = 0; i < split.length; i++) {
			
			flag = printTheResult(split[i], flag);
			if(flag)
			{
				for(String s:split)
				{
					if(s==split[i])
					{
						
					}
				}
			}
		}
		if (flag) {
			System.out.println("Its a palindrome");
		} else {
			System.out.println("Not a palindrome");
		}
	}

	private static boolean printTheResult(String pali, boolean flag) {
		int i = 0;
		while (i < (pali.length() / 2)) {
			if (pali.charAt(i) == pali.charAt(pali.length() - (i + 1))) {
				flag = true;
				
				i++;
			} else {
				flag = false;
				break;
			}

		}
		return flag;
	}

}
