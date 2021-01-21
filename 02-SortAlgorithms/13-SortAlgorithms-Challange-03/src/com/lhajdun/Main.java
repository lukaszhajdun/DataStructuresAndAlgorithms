package com.lhajdun;

public class Main {

    public static void main(String[] args) {

        String[] stringArray = {"bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};
        radixSort(stringArray, 26, stringArray.length);
        printArray(stringArray);
        
    }

    public static void radixSort(String[] input, int radix, int width) {
        for (int i = width - 1; i >= 0; i--) {
            radixSingleSort(input, i, radix);
        }
    }

    public  static void radixSingleSort(String[] input, int position, int radix) {
        int numItems = input.length;
        int[] countArray = new int[radix];

        for (String value: input) {
            countArray[getIndex(position, value)]++;
        }
        // Adjust the count array
        for (int j = 1; j < radix; j++) {
            countArray[j] += countArray[j - 1];
        }

        // Copy values in sorted order into temporary array
        String[] temp = new String[numItems];
        for (int tempIdx = numItems -1; tempIdx >= 0; tempIdx--) {
            temp[--countArray[getIndex(position, input[tempIdx])]] = input[tempIdx];
        }

        // We can also use System.copyarray() method
        for (int tempIxd = 0; tempIxd < numItems; tempIxd++) {
            input[tempIxd] = temp[tempIxd];
        }
    }

    public static int getIndex(int position, String value) {
        // Translating numeric value for the character into an index in counting array
        return value.charAt(position) - 'a';
    }

    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("intArray[%d] = %s%n", i, array[i]);
        }
    }
}

