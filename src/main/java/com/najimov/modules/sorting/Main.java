package com.najimov.modules.sorting;

public class Main {
    public static void main(String[] args) {
        int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};
        bubbleSort(array);
        selectionSort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    /*
        Bubble Sort: We basically compare an element with its neighbor. If we are sorting in ascending order,
                     we check if the element is greater than its neighbor and, if so, switch their positions.
                     The vice versa applies for descending order.
        Time complexity: O(n^2) for each value we go through the array
        Space complexity: O(1) it does not create extra temporary array. just variable.
     */
    private static void bubbleSort(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    /*
        Selection Sort: Go through the array to find the lowest value.
                        Move the lowest value to the front of the unsorted part of the array
                        Go through the array again as many times as there are values in the array.
         Time Complexity: O(n^2) - we need to go all the way array to find the lowest element in each lap
         Space Complexity: O(1) -  no need to create separate array except just variables.
     */
    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int midIndex = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[midIndex]) {
                    midIndex = j;
                }
            }
            if (midIndex != i) {
                int temp = array[i];
                array[i] = array[midIndex];
                array[midIndex] = temp;
            }
        }
    }
}
