package thisiscodingtest.sort;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    int tmp = array[min];
                    array[min] = array[j];
                    array[j] = tmp;
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
