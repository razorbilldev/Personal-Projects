package com.najimov.modules.leetcode.medium;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1};
        System.out.println(solution.longestOnesSecondSolution(nums, 0));
    }

    public int maxVowels(String s, int k) {
        int max = 0, count = 0;
        String vowels = "aeiou";
        for (int i = 0; i < s.length(); i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) {
                count++;
            }
            if (i >= k && vowels.indexOf(s.charAt(i - k)) != -1) {
                count--;
            }
            max = Math.max(max, count);
        }
        return max;
    }

    public int longestOnes(int[] nums, int k) {
        int max = 0, countK = 0;
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                queue.add(1);
            } else if (nums[i] == 0 && countK < k) {
                queue.add(0);
                countK++;
            } else if (nums[i] == 0 && countK == k && k != 0) {
                max = Math.max(queue.size(), max);
                while (queue.element() != 0) {
                    queue.remove();
                }
                queue.poll();
                countK--;
                queue.add(0);
                countK++;
            } else if (nums[i] == 0 && countK == k && k == 0) {
                max = Math.max(queue.size(), max);
                while (queue.iterator().hasNext()) {
                    queue.remove();
                }
            }
        }
        return Math.max(queue.size(), max);
    }

    public int longestOnesSecondSolution(int nums[], int k) {
        int right = 0, left = 0, zeros = 0;
        while (right < nums.length) {
            if (nums[right] == 0) zeros++;
            if (zeros > k) {
                if (nums[left] == 0) {
                    zeros--;
                }
                left++;
            }
            right++;
        }
        return right - left;
    }

    public int longestSubarray(int[] nums) {
        if (nums.length == 1) return 0;
        List<Integer> list = new ArrayList<>();
        int countOnes = 0, countZeros = 0;
        int max = Integer.MIN_VALUE;
        boolean status = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                countOnes++;
                if (i == nums.length - 1) list.add(countOnes);
            } else {
                status = true;
                if (countOnes != 0) {
                    list.add(countOnes);
                    countOnes = 0;
                } else if (countZeros != 0) {
                    list.add(0);
                    countZeros = 0;
                }
                countZeros++;
            }
        }
        if (list.size()==1) {
            if (status) {
                return list.get(0)-1;
            }
            return list.get(0);
        }
        for (int i = 0; i < list.size() - 1; i++) {
            max = Math.max(list.get(i) + list.get(i + 1), max);
        }
        return max;
    }
}

