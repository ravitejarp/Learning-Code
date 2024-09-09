package com.ravi.grooking;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWith0s1sReplacing {
    public static void main(String[] args) {
        LongestSubstringWith0s1sReplacing l = new LongestSubstringWith0s1sReplacing();
        System.out.println(l.longestSubstringWithNonRepeatUpdated("0100110110011", 3));
        System.out.println(l.longestSubstringWithNonRepeatUpdated("01100011011", 2));
        System.out.println(l.longestSubstringWithNonRepeatUpdated("abbcb", 1));
        System.out.println(l.longestSubstringWithNonRepeatUpdated("abccde", 1));

    }


    public int longestSubstringWithNonRepeatUpdated(String input, int maxReplacements) {
        int startIndex = 0;
        int maxRepeatedCount = 0;
        int totalLen = 0;
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char charAt = input.charAt(i);
            if (!characterIntegerMap.containsKey(charAt)) {
                characterIntegerMap.put(charAt, 0);
            }
            characterIntegerMap.put(charAt, characterIntegerMap.get(charAt) + 1);
            maxRepeatedCount = Math.max(maxRepeatedCount, characterIntegerMap.get(charAt));
            if (i - startIndex + 1 - maxRepeatedCount > maxReplacements) {
                char c = input.charAt(startIndex);
                characterIntegerMap.put(c, characterIntegerMap.get(c) - 1);
                startIndex++;
            }
            totalLen = Math.max(totalLen, i - startIndex + 1);
        }
        return totalLen;
    }

    public int longestSubstringWithNonRepeatUpdated(int[] nums, int k) {
        int startIndex = 0;
        int maxRepeatedCount = 0;
        int totalLen = 0;
        Map<Integer, Integer> characterIntegerMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int charAt = nums[i];
            if (!characterIntegerMap.containsKey(charAt)) {
                characterIntegerMap.put(charAt, 0);
            }
            characterIntegerMap.put(charAt, characterIntegerMap.get(charAt) + 1);
            maxRepeatedCount = Math.max(maxRepeatedCount, characterIntegerMap.get(charAt));
            if (i - startIndex + 1 - maxRepeatedCount > k) {
                int c = nums[startIndex];
                characterIntegerMap.put(c, characterIntegerMap.get(c) - 1);
                startIndex++;
            }
            totalLen = Math.max(totalLen, i - startIndex + 1);
        }
        return totalLen;
    }


}