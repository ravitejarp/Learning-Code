package com.ravi.grooking;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithKdistinct {
    public static void main(String[] args) {
        LongestSubstringWithKdistinct l = new LongestSubstringWithKdistinct();
        System.out.println(l.longestSubstringWithKdistinct("araaci", 2));
        System.out.println(l.longestSubstringWithKdistinct("araaci", 1));
        System.out.println(l.longestSubstringWithKdistinct("cbbebi", 3));
    }


    public String longestSubstringWithKdistinct(String input, int k) {
        Set<Character> characterMap = new HashSet<>();
        String longestSub = "";
        int startIndex = 0;
        for (int i = 0; i < input.length(); i++) {
            if (!characterMap.contains(input.charAt(i)) && characterMap.size() == k) {
                if (i - startIndex > longestSub.length())
                    longestSub = input.substring(startIndex, i);
                startIndex = i;
                characterMap.clear();
            }
            characterMap.add(input.charAt(i));
        }
        return longestSub;
    }
}
