package com.lhajdun;

public class Main {

    public static void main(String[] args) {
        int[] intArray = new int[7];

        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;

        for (int i = 0; i < intArray.length; i++) {
            System.out.println("intArray = " + intArray[i]);
        }

        /* *
        *
        * Arrays:
        *   contiguous block in memory
        *   every element occupies the same amount of space in memory
        *
        *   if array starts at memory address x and the size of each element in array is y
        *   we can calculate the memory address of the ith element by using the following expression:
        *   x = i * y
        *
        * Retrieve an Element from an Array
        *   Steps:
        *       1. Multiply the size of the element by its index
        *       2. Get the start address of the array
        *       3. Add the start address to the result of the multiplication
        *   In this case Big-O value is: O(1)
        *   In worst case (element is the last element) is Big-O values is: O(n)
        *
        * */

        int index = -1;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == 7) {
                index = i;
                break;
            }
        }
        System.out.println("index = " + index);


        /* *
        *
        * Operations and the time complexity:
        *   Retrieve with index: O(1) - constant time
        *   Retrieve without index: O(n) - linear time
        *   Add an element to a full array: O(n)
        *   Add an element to the end of an array (has space): O(1)
        *   Insert or update an element at a specific index: O(1)
        *   Delete an element by setting it to null: O(1)
        *   Delete an element by shifting elements: O(n)
        *
        * */

    }
}
