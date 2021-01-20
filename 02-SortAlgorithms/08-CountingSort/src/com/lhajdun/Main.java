package com.lhajdun;

public class Main {

    /* *
     *
     * Counting Sort:
     *   NOT in-place algorithm - we need to create another array (counting array)
     *   O(n) - can achieve this because we're making assumptions about the data we're sorting
     *   Unstable algorithm
     *   If we want the sort to be stable, we have to do some extra steps
     *
     * */

    public static void main(String[] args) {
        // Sorting values between 1 and 10 inclusive
        int[] intArray = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};

        countingSort(intArray, 1, 10);
        printArray(intArray);
        
    }

    public static void countingSort(int[] input, int min, int max) {
        int[] countArray = new int[(max - min) + 1];

        for (int i = 0; i < input.length; i++) {
            // Counting phase
            // [input[i] - min] translating value we want to count into its index
            countArray[input[i] - min]++;
        }

        int j = 0;
        for (int i = min; i <= max; i++) {
            while (countArray[i - min] > 0) {
                input[j++] = i;
                countArray[i - min]--;
            }
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("intArray[%d] = %d%n", i, array[i]);
        }
    }
}

