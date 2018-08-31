package com.paprika.javaplayground;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 数组中和为指定值的成员index；
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] input = new int[]{2, 7, 11, 15};
        int sum = 13;
        int[] output1 = twoSum1(input, sum);
        int[] output2 = twosum2(input, sum);
        System.out.println("input:" + Arrays.toString(input) + "\noutput1:" + Arrays.toString(output1)+ "\noutput2:" + Arrays.toString(output2));
    }


    public static int[] twoSum1(int[] arrays, int sum) {
        int[] result = new int[2];
        if (arrays != null && arrays.length > 0) {
            for (int i = 0; i < arrays.length; i++) {
                if (arrays[i] > sum) {
                    continue;
                }
                for (int j = i + 1; j < arrays.length; j++) {
                    if (arrays[j] > sum) {
                        continue;
                    }
                    if (arrays[i] + arrays[j] == sum) {
                        result[0] = i;
                        result[1] = j;
                    }
                }
            }
        }
        return result;
    }

    public static int[] twosum2(int[] arrays, int sum) {
        int[] result = new int[2];
        Map<Integer, Integer> arrayMap = new HashMap<>();
        for (int i = 0; i < arrays.length; i++) {
            arrayMap.put(arrays[i], i);
        }
        for (int i = 0; i < arrays.length; i++) {
            Integer index = arrayMap.get(sum - arrays[i]);
            if (index != null && index != i) {
                result[0] = i;
                result[1] = index;
                break;
            }
        }
        return result;
    }

}
