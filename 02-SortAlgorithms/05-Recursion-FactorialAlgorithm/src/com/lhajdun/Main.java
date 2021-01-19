package com.lhajdun;

public class Main {

    public static void main(String[] args) {

        int num = 3;
        System.out.printf("Factorial(%d) = %d%n", num, iterativeFactorial(num));
        System.out.printf("Factorial(%d) = %d%n", num, recursiveFactorial(num));

    }

    // Recursive Implementation - it is simpler
    public static int recursiveFactorial(int num) {
        // Breaking Condition (Base Case)
        if (num == 0) {
            return 1;
        }
        return num * recursiveFactorial(num - 1);
    }

    // Iterative Implementation - it is faster
    public static int iterativeFactorial(int num) {
        if (num == 0) {
            return 1;
        }

        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
