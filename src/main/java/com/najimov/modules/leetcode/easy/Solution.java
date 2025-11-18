package com.najimov.modules.leetcode.easy;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        System.out.println(Solution.findMaxAverage(nums, k));
    }

    public static double findMaxAverage(int[] nums, int k) {
        int maxSum = Integer.MIN_VALUE;
        int sum =0;
        //calulate the first window sum
        for(int i=0;i<k;i++){
            sum += nums[i];
        }

        maxSum = sum;

        //now loop over the remaining array ,using this window calculate sum and compare with maxSum
        for(int i=k;i<nums.length;i++){
            sum = sum - nums[i-k] + nums[i];
            maxSum = Math.max(maxSum, sum);
        }
        return (double) maxSum / k;
    }
}
