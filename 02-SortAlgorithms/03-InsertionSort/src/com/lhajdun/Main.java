package com.lhajdun;

public class Main {

    /* *
     *
     * Insertion Sort:
     *   In-place algorithm - we don't need to create another array
     *   O(n2) time complexity - quadratic
     *   It will take 10 000 steps to sort 100 items
     *   Stable algorithm
     *
     * */

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for (int firstUnsortedIdx = 1; firstUnsortedIdx < intArray.length;
                firstUnsortedIdx++) {

            int newElement = intArray[firstUnsortedIdx];
            int i;

            for (i = firstUnsortedIdx; i > 0 && intArray[i - 1] > newElement; i--) {
                intArray[i] = intArray[i - 1];
            }

            intArray[i] = newElement;
        }

        printArray(intArray);

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("intArray[%d] = %d%n", i, array[i]);
        }
    }
}
