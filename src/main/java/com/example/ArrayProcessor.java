package com.example;

public class ArrayProcessor {
    /**
     * Processes an array by summing even numbers and subtracting odd numbers.
     * Returns 0 if the array is null or empty.
     */
    public static int process(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum += array[i];
            } else {
                sum -= array[i];
            }
        }
        return sum;
    }
}
