package com.lhajdun;

public class Main {

    // Insertion Sort using recursion

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        insertionSort(intArray, intArray.length);
        printArray(intArray);

    }

    public static void insertionSort(int[] inputArray, int numItems) {
        if (numItems < 2) {
            return;
        }
        insertionSort(inputArray, numItems - 1);

        int newElement = inputArray[numItems - 1];
        int i;

        for (i = numItems - 1; i > 0 && inputArray[i - 1] > newElement; i--) {
            inputArray[i] = inputArray[i - 1];
        }

        inputArray[i] = newElement;

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("intArray[%d] = %d%n", i, array[i]);
        }
    }
}


