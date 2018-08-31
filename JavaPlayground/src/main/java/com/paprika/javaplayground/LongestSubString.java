package com.paprika.javaplayground;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 最长不重复子字符串；
 */
public class LongestSubString {
    public static void main(String[] args) {
        String input = "abcdabcdefggfdchjua";
        input = "aaaaad11a";
        int[] result = lengthOfLongestSubString(input);
        System.out.println("input:" + input + "\noutput:" + Arrays.toString(result) + "\nsubstring:" + input.substring(result[1], result[2] + 1));
    }

    /**
     * abcdabb
     * O(n)
     *
     * @param value
     * @return
     */
    public static int[] lengthOfLongestSubString(String value) {
        Map<Character, Integer> charMap = new HashMap<>();
        int[] result = new int[3];
        int max = 0;
        int start = 0;
        int length;
        char c;
        for (int i = 0; i < value.length(); i++) {
            c = value.charAt(i);
            start = Math.max(start, charMap.containsKey(c) ? charMap.get(c) + 1 : 0);

            length = i - start + 1;
            if (length > max) {
                max = length;
                result[0] = max;
                result[1] = start;
                result[2] = i;
            }
            charMap.put(c, i);
        }
        return result;
    }

}
