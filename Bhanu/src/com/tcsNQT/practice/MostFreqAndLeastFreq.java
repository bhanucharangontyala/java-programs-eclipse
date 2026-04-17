package com.tcsNQT.practice;

import java.util.*;

public class MostFreqAndLeastFreq {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 4, 3, 2, 1, 3, 3};

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxFreq = Integer.MIN_VALUE;
        int minFreq = Integer.MAX_VALUE;

        int mostFreqElement = -1;
        int leastFreqElement = -1;

        // Find elements
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();

            if (freq > maxFreq) {
                maxFreq = freq;
                mostFreqElement = num;
            }

            if (freq < minFreq) {
                minFreq = freq;
                leastFreqElement = num;
            }
        }

        System.out.println("Most frequent element: " + mostFreqElement);
        System.out.println("Least frequent element: " + leastFreqElement);
    }
}
