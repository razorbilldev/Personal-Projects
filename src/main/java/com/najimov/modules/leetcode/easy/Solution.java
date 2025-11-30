package com.najimov.modules.leetcode.easy;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};
        int[] arr = {2, 2, 1, 1, 3};
        System.out.println(uniqueOccurrences(arr));
    }

    public static double findMaxAverage(int[] nums, int k) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        //calulate the first window sum
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        maxSum = sum;

        //now loop over the remaining array ,using this window calculate sum and compare with maxSum
        for (int i = k; i < nums.length; i++) {
            sum = sum - nums[i - k] + nums[i];
            maxSum = Math.max(maxSum, sum);
        }
        return (double) maxSum / k;
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (Integer n : nums1) set1.add(n);
        for (Integer n : nums2) set2.add(n);
        Set<Integer> onlySet1 = new HashSet<>(set1);
        Set<Integer> onlySet2 = new HashSet<>(set2);
        onlySet1.removeAll(set2);
        onlySet2.removeAll(set1);
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>(onlySet1));
        result.add(new ArrayList<>(onlySet2));
        return result;
    }

    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        Set<Integer> set = new HashSet<>();
        for (Integer num : map.values()) {
            if (!set.add(num)) {
                return false;
            }
        }
        return true;
    }
}
