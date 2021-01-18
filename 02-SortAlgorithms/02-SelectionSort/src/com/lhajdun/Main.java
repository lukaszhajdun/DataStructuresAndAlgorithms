package com.lhajdun;

public class Main {

    /* *
     *
     * Selection Sort:
     *   In-place algorithm - we don't need to create another array
     *   O(n2) time complexity - quadratic
     *   It will take 10 000 steps to sort 100 items
     *   Doesn't require as much swapping as bubble sort - usually perform better than bubble sort
     *   Unstable algorithm
     *
     * */

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0;
                lastUnsortedIndex--) {

            int largestElementIdx = 0;

            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[largestElementIdx]) {
                    largestElementIdx = i;
                }
            }

            swap(intArray, largestElementIdx, lastUnsortedIndex);

        }

        printArray(intArray);


    }

    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("intArray[%d] = %d%n", i, array[i]);
        }
    }
}
