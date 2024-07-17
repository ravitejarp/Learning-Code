package com.ravi.leet;

import java.util.Date;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(new Date(Integer.parseInt("1718366105")));
//        System.out.println(new Palindrome().isPalindrome("A man, a plan, a canal: Panama"));
//        System.out.println(new Palindrome().isPalindrome(" "));
    }

    private boolean isPalindrome(String s) {
        s = s.toLowerCase();
        for (int i = 0, j = s.length() - 1; i <= j; i++, j--) {
            while (i < s.length() - 1 && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }
            while (j > 0 && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }
            if (Character.isLetterOrDigit(s.charAt(i)) && Character.isLetterOrDigit(s.charAt(j)) && (s.charAt(i) != s.charAt(j))) {
                return false;
            }
        }
        return true;
    }
}
