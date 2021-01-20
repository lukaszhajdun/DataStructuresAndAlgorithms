package com.lhajdun;

public class Main {

    /* *
     *
     * Radix Sort:
     *
     *   In-place depends on which sort algorithm you use
     *   O(n) - can achieve this because we're making assumptions about the data we're sorting
     *   Even so, it often runs slower than O(nlogn) algorithms because of the overhead involved
     *   Stable algorithm
     *
     * */

    public static void main(String[] args) {
        // Radix = 10 - from 0 to 9
        int[] radixArray = {4725, 4586, 1330, 8792, 1594, 5729};

        radixSort(radixArray, 10, 4);
        printArray(radixArray);
        
    }

    public static void radixSort(int[] input, int radix, int width) {
        for (int i = 0; i < width; i++) {
            radixSingleSort(input, i, radix);
        }
    }

    public  static void radixSingleSort(int[] input, int position, int radix) {
        int numItems = input.length;
        int[] countArray = new int[radix];

        for (int value: input) {
            countArray[getDigit(position, value, radix)]++;
        }
        // Adjust the count array
        for (int j = 1; j < radix; j++) {
            countArray[j] += countArray[j - 1];
        }

        // Copy values in sorted order into temporary array
        int[] temp = new int[numItems];
        for (int tempIdx = numItems -1; tempIdx >= 0; tempIdx--) {
            temp[--countArray[getDigit(position, input[tempIdx], radix)]] = input[tempIdx];
        }

        // We can also use System.copyarray() method
        for (int tempIxd = 0; tempIxd < numItems; tempIxd++) {
            input[tempIxd] = temp[tempIxd];
        }
    }

    public static int getDigit(int position, int value, int radix) {
        // For position = 0, value = 4725 and radix = 10 the return is 5
        // return 4725 / (int) Math.pow(10, 0) % 10
        // return 4725 / 1 % 10
        // return 4725 % 10
        // return 5
        return value / (int) Math.pow(radix, position) % radix;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("intArray[%d] = %d%n", i, array[i]);
        }
    }
}

