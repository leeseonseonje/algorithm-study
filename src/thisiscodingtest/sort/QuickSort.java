package thisiscodingtest.sort;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {

        int[] array = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

        quickSort(array, 0, array.length - 1);

        System.out.println(Arrays.toString(array));
    }

    public static void quickSort(int[] array, int start, int end) {

        if (start >= end) {
            return;
        }

        int pivot = start;
        int left = start + 1;
        int right = end;

        while (left <= right) {
            while (left <= end && array[left] <= array[pivot]) {
                left++;
            }

            while (right > start && array[right] >= array[pivot]) {
                right--;
            }

            if (left > right) {
                int tmp = array[right];
                array[right] = array[pivot];
                array[pivot] = tmp;
            } else {
                int tmp = array[left];
                array[left] = array[right];
                array[right] = tmp;
            }
        }
        quickSort(array, start, right);
        quickSort(array, right + 1, end);
    }
}
