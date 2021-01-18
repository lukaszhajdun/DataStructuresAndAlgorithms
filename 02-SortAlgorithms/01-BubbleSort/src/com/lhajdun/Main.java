package com.lhajdun;

public class Main {

    /* *
     *
     * Bubble Sort:
     *   In-place algorithm - we don't need to create another array
     *   O(n2) time complexity - quadratic
     *   It will take 10 000 steps to sort 100 items
     *   Algorithm degrades quickly
     *
     * */

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0;
             lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[i+1]) {
                    swap(intArray, i, i + 1);
                }
            }
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

