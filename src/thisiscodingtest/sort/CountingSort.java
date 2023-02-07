package thisiscodingtest.sort;

import java.util.Arrays;

public class CountingSort {

    public static void main(String[] args) {

        int[] array = {7, 5, 9, 0, 3, 1, 6, 3, 4, 8, 8};

        int max = getMax(array);

        int[] results = new int[max + 1];

        for (int i = 0; i < array.length; i++) {
            results[array[i]]++;
        }

        for (int i = 0; i < results.length; i++) {
            for (int j = 0; j < results[i]; j++) {
                System.out.print(i + " ");
            }
        }
    }

    private static int getMax(int[] array) {
        int max = array[0];

        for (int i : array) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }
}
