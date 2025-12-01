package com.najimov.modules.leetcode.hard;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int n = 2;
        int[] batteries = {3, 3, 3};
        System.out.println(maxRunTime(n, batteries));
    }

    public static long maxRunTime(int n, int[] batteries) {
        long sum=0;
        for (int b: batteries) sum += b;
        long left = 0, right = sum / n;
        while (left < right) {
            long mid = (left + right + 1) / 2;
            if (canRun(mid, n, batteries)) {
                left = mid;
            }else {
                right = mid - 1;
            }
        }
        return left;
    }

    private static boolean canRun(long t, int n, int[] batteries) {
        long total=0;
        for (int b : batteries) {
            total += Math.min(b, t);

        }
        return total >= n * t;
    }
}
