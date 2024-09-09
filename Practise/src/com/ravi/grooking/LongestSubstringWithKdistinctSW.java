package com.ravi.grooking;

import java.util.*;

public class LongestSubstringWithKdistinctSW {
    public static void main(String[] args) {
        LongestSubstringWithKdistinctSW l = new LongestSubstringWithKdistinctSW();
        System.out.println(l.longestSubstringWithKdistinct("araaci", 2));
        System.out.println(l.longestSubstringWithKdistinct("araaci", 1));
        System.out.println(l.longestSubstringWithKdistinct("cbbebi", 3));
        System.out.println(l.longestSubstringWithKdistinct("33312112334", 2));
        System.out.println(l.longestSubstringWithKdistinct("121", 2));
        System.out.println(l.longestSubstringWithKdistinct("0122", 2));
        System.out.println(l.longestSubstringWithKdistinct("12322", 2));
        System.out.println(l.longestSubstringWithKdistinct("ABCAC", 2));
        System.out.println(l.longestSubstringWithKdistinct("ABCBBC", 2));
        System.out.println(l.longestSubstringWithKdistinct("aabccbb", "aabccbb".length()));

    }


    public int longestSubstringWithKdistinct(String fruits, int k) {
        Map<Character, Integer> characterMap = new HashMap<>();
        int longestSub = 0;
        int startIndex = 0;
        for (int i = 0; i < fruits.length(); i++) {
            if (characterMap.containsKey(fruits.charAt(i))) {
                characterMap.put(fruits.charAt(i), characterMap.get(fruits.charAt(i)) + 1);
            } else {
                characterMap.put(fruits.charAt(i), 1);
                if (characterMap.size() > k) {
                    longestSub = Math.max(longestSub, i - startIndex);
                    while (characterMap.size() > k) {
                        if (characterMap.get(fruits.charAt(startIndex)) - 1 == 0) {
                            characterMap.remove(fruits.charAt(startIndex));
                        } else {
                            characterMap.put(fruits.charAt(startIndex), characterMap.get(fruits.charAt(startIndex)) - 1);
                        }
                        startIndex++;
                    }
                }
            }
        }
        longestSub = Math.max(longestSub, fruits.length() - startIndex);
        return longestSub;
    }

    public int longestSubstringWithKdistinct(int[] fruits, int k) {
        Map<Integer, Integer> characterMap = new HashMap<>();
        int longestSub = 0;
        int startIndex = 0;
        for (int i = 0; i < fruits.length; i++) {
            if (characterMap.containsKey(fruits[i])) {
                characterMap.put(fruits[i], characterMap.get(fruits[i]) + 1);
            } else {
                characterMap.put(fruits[i], 1);
                if (characterMap.size() > k) {
                    longestSub = Math.max(longestSub, i - startIndex);
                    while (characterMap.size() > k) {
                        if (characterMap.get(fruits[startIndex]) - 1 == 0) {
                            characterMap.remove(fruits[startIndex]);
                        } else {
                            characterMap.put(fruits[startIndex], characterMap.get(fruits[startIndex]) - 1);
                        }
                        startIndex++;
                    }
                }
            }
        }
        longestSub = Math.max(longestSub, fruits.length - startIndex);
        return longestSub;
    }
}
