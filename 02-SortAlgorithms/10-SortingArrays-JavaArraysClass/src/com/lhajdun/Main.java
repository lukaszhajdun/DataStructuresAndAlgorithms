package com.lhajdun;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

//        Arrays.sort(intArray);
        Arrays.parallelSort(intArray);
        printArray(intArray);
        
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("intArray[%d] = %d%n", i, array[i]);
        }
    }
}

