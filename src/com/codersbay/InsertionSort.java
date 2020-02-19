package com.codersbay;


import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int[] numbers = {5, 8, 3, 1, 6, 4, 3, 1};

        int tmp;
        int lengthUnsorted = numbers.length;
        int startUnsorted = 1;

        for (int i = startUnsorted; i < lengthUnsorted; i++) {

            for (int j = i; j < lengthUnsorted && j > 0; j--) {
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
