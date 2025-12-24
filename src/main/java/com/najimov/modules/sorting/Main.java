package com.najimov.modules.sorting;

public class Main {
    public static void main(String[] args) {
        int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};
        bubbleSort(array);
        selectionSort(array);
        insertionSort(array);
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
            for (int j = i + 1; j < array.length; j++) {
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

    /*
        Insertion Sort: Takes the 2nd value from unsorted array, the 1st value is considered as in the sorted part.
                        Move the value into the correct position at the sorted array, first shift all larger values by 1 position to the right and insert the value.
                        Go through the unsorted part of the array again as many times as there are values.
        Time Complexity: O(n^2) - worst case, when we take one value from unsorted array we need to go through the sorted array to find the correct position to insert, and we need to do this operation for each value from unsorted array part.
        Space Complexity: O(1) - we just need a couple of variables, there is no need to create separate array.
     */
    private static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }
}
