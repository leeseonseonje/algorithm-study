package thisiscodingtest.sort;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int[] array = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

        for (int i = 1; i < array.length; i++) {
            int x = array[i];
            for (int j = i - 1; j >= 0; j--) {
                if (x < array[j]) {
                    int tmp = array[j];
                    array[j] = x;
                    array[j + 1] = tmp;
                } else {
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
