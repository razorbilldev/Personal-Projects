package com.najimov.modules.leetcode.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int[] nums2 = {2,4,6};
        System.out.println(findDifference(nums1, nums2));
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
        List<List<Integer>> result = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (Integer num1 : nums1) {
            for (Integer num2 : nums2) {
                if (!num1.equals(num2)) {
                    set1.add(num1);
                }
            }
        }
        for (Integer num2 : nums2) {
            for (Integer num1 : nums1) {
                if (!num2.equals(num1)) {
                    set2.add(num2);
                }
            }
        }
        result.add(new ArrayList<>(set1));
        result.add(new ArrayList<>(set2));
        return result;
    }
}
