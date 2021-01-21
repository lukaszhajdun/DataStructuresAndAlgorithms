package com.lhajdun;

public class Main {

    // Merge Sort - reverse order

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        mergeSort(intArray, 0, intArray.length);

        printArray(intArray);

    }

    public static void mergeSort(int[] inputArray, int start, int end) {
        if(end - start < 2) {
            return;
        }

        // find mid point
        int mid = (start + end) / 2;
        mergeSort(inputArray, start, mid);
        mergeSort(inputArray, mid, end);
        merge(inputArray, start, mid, end);

    }

    public static void merge(int[] inputArray, int start, int mid, int end) {
        // Optimization (all left partition elements are sorted and the largest element is smaller or equal to
        // the smallest element on right partition - this elements also are sorted, so input array is already sorted)
        if (inputArray[mid - 1] >= inputArray[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            temp[tempIndex++] = (inputArray[i] >= inputArray[j]) ? inputArray[i++] : inputArray[j++];
        }
        // Optimization - Handling the remaining elements (only the left side matters)
        System.arraycopy(inputArray, i, inputArray, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, inputArray, start, tempIndex);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("intArray[%d] = %d%n", i, array[i]);
        }
    }
}

