package com.ravi.grooking;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithReplacing {
    public static void main(String[] args) {
        LongestSubstringWithReplacing l = new LongestSubstringWithReplacing();
        System.out.println(l.longestSubstringWithNonRepeatUpdated("aabccbb", 2));
        System.out.println(l.longestSubstringWithNonRepeatUpdated("abbcb", 1));
        System.out.println(l.longestSubstringWithNonRepeatUpdated("abccde", 1));

    }


    public int longestSubstringWithNonRepeat(String input, int maxReplacements) {
        int startIndex = 0;
        int tempRepl = maxReplacements;
        int totalLen = 0;
        for (int i = 0; i < input.length(); i++) {
            char e = input.charAt(i);
            if (input.charAt(startIndex) != e) {
                if (tempRepl <= 0) {
                    do {
                        startIndex++;
                        tempRepl++;
                    } while (input.charAt(startIndex) != e && startIndex + maxReplacements < i && tempRepl <= maxReplacements);
                } else {
                    tempRepl--;
                }
            }
            totalLen = Math.max(totalLen, i + 1 - startIndex);
        }
        return totalLen;
    }

    public int longestSubstringWithNonRepeatUpdated(String input, int maxReplacements) {
        int startIndex = 0;
        int totalLen = 0;
        for (int i = 0; i < input.length(); i++) {
            char e = input.charAt(i);
            if (input.charAt(startIndex) != e && (i - startIndex + 1 - maxReplacements) > maxReplacements) {
                startIndex++;
            }
            totalLen = Math.max(totalLen, i + 1 - startIndex);
        }
        return totalLen;
    }


}