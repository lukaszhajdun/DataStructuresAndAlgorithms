package com.lhajdun;

public class Main {

    /* *
     *
     * Shell Sort:
     *   In-place algorithm - we don't need to create another array
     *   O(nlogn) - base 2. We're repeatedly partitioning the array into two halves
     *   Unstable algorithm
     *
     * */

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        quickSort(intArray, 0, intArray.length);
        printArray(intArray);
        
    }

    public static void quickSort(int[] inputArray, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int pivotIndex = partition(inputArray, start, end);
        quickSort(inputArray, start, pivotIndex);
        quickSort(inputArray, pivotIndex + 1, end);
    }

    public static int partition(int[] inputArray, int start, int end) {
        // Using the first element as the pivot
        int pivot = inputArray[start];
        int i = start;
        int j = end;

        while (i < j) {
            // Empty while loop body - using the loop to decrement j
            while (i < j && inputArray[--j] >= pivot);
            if (i < j) {
                inputArray[i] = inputArray[j];
            }

            // Empty while loop body - using the loop to increment i
            while (i < j && inputArray[++i] <= pivot);
            if (i < j) {
                inputArray[j] = inputArray[i];
            }
        }
        inputArray[j] = pivot;
        return j;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("intArray[%d] = %d%n", i, array[i]);
        }
    }
}

