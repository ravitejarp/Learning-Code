package com.ravi.grooking;

import java.util.HashMap;
import java.util.Map;

public class StringPatterns {

    public static void main(String[] args) {
        StringPatterns.findPatters("eidbaooo", "ab");
    }

    public static boolean findPatters(String input, String pattern) {
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char charAt = pattern.charAt(i);
            if (characterIntegerMap.containsKey(charAt)) {
                characterIntegerMap.put(charAt, characterIntegerMap.get(charAt) + 1);
            } else {
                characterIntegerMap.put(charAt, 1);
            }
        }

        int startIndex = 0;
        int matchSize = 0;
        for (int endIndex = 0; endIndex < input.length(); endIndex++) {
            char charAt = input.charAt(endIndex);
            if (characterIntegerMap.containsKey(charAt)) {
                characterIntegerMap.put(charAt, characterIntegerMap.get(charAt) - 1);
                if (characterIntegerMap.get(charAt) == 0) {
                    matchSize++;
                }
            }
            if (matchSize == characterIntegerMap.size()) {
                return true;
            }
            if (endIndex >= pattern.length() - 1) {
                char startChar = input.charAt(startIndex);
                if (characterIntegerMap.containsKey(startChar)) {
                    if (characterIntegerMap.get(startChar) == 0)
                        matchSize--;
                    characterIntegerMap.put(startChar, characterIntegerMap.get(startChar) + 1);
                }
                startIndex++;

            }
        }
        return false;


    }
}
