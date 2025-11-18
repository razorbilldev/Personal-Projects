package com.najimov.modules.multithread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Implement a multithreaded program that reverses a list of strings.
 * Each string in the list should be reversed in a separate thread, and the final result should be a new list containing all the reversed strings in the same order as the original list.
 * Requirements:
 * Use Java threads / ExecutorService.
 * Input: List of strings.
 * Output: List of reversed strings (order preserved).
 * Each reversal should happen in its own thread.
 **/
public class Solution {
    public static void main(String[] args) {
        List<String> input = List.of("Hello", "world", "java", "threads");
        List<String> output = reverse(input);
        System.out.println(output);
    }

    public static List<String> reverse(List<String> strings) {
        int n = strings.size();
        ExecutorService executorService = Executors.newFixedThreadPool(n);
        List<Future<String>> futures = new ArrayList<>();

        for (String s : strings) {
            futures.add(executorService.submit(() -> new StringBuilder(s).reverse().toString()));
        }

        executorService.shutdown();

        List<String> result = new ArrayList<>();
        try {
            for (Future<String> future : futures) {
                result.add(future.get());
            }
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return result;
    }
}

/*
1. How to work with interapted expections(thread)?
2.
 */
