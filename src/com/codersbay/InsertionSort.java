package com.codersbay;


import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int[] numbers = {5, 8, 3, 1, 6, 4, 3, 1};

        int tmp = Integer.MIN_VALUE;
        int lengthUnsorted = numbers.length;
        int currentMax = 0;

        for (int i = 0; i < lengthUnsorted; i++) {

            for (int j = 1; j < lengthUnsorted; j++) {
                if (numbers[j] < numbers[j - 1]) {
                    tmp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}