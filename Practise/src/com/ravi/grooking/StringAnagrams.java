package com.ravi.grooking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringAnagrams {

    public static void main(String[] args) {
        System.out.println(StringAnagrams.findAnagrams("ppqp", "pq"));
        System.out.println(StringAnagrams.findAnagrams("abbcabc", "abc"));
    }

    public static List<String> findAnagrams(String input, String pattern) {
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if (!characterIntegerMap.containsKey(c)) {
                characterIntegerMap.put(c, 0);
            }
            characterIntegerMap.put(c, characterIntegerMap.get(c) + 1);
        }

        int startIndex = 0;
        int match = 0;
        List<String> anagrams = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (characterIntegerMap.containsKey(c)) {
                characterIntegerMap.put(c, characterIntegerMap.get(c) - 1);
                if (characterIntegerMap.get(c) == 0)
                    match++;
            }
            if (match == characterIntegerMap.size()) {
                anagrams.add(input.substring(startIndex, i + 1));
            }
            if (i >= pattern.length() - 1) {
                char charAt = input.charAt(startIndex);
                if (characterIntegerMap.containsKey(charAt)) {
                    if (characterIntegerMap.get(charAt) == 0)
                        match--;
                    characterIntegerMap.put(charAt, characterIntegerMap.get(charAt) + 1);
                }
                startIndex++;

            }

        }
        return anagrams;


    }
}
