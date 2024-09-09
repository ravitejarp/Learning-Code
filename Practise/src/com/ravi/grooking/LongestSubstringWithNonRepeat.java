package com.ravi.grooking;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithNonRepeat {
    public static void main(String[] args) {
        LongestSubstringWithNonRepeat l = new LongestSubstringWithNonRepeat();
        System.out.println(l.longestSubstringWithNonRepeat("aabccbb"));
        System.out.println(l.longestSubstringWithNonRepeat("abbbb"));
        System.out.println(l.longestSubstringWithNonRepeat("abccde"));

    }


    public int longestSubstringWithNonRepeat(String fruits) {
        Set<Character> characterMap = new HashSet<>();
        int startIndex = 0;
        int totalLen = 0;
        for (int i = 0; i < fruits.length(); i++) {
            char e = fruits.charAt(i);
            if (characterMap.contains(e)) {
                totalLen = Math.max(characterMap.size(), totalLen);
                while (fruits.charAt(startIndex) != e) {
                    characterMap.remove(fruits.charAt(startIndex));
                    startIndex++;
                }
                startIndex++;
            }
            characterMap.add(e);

        }
        return totalLen;
    }


}