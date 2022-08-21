package thisiscodingtest;

import java.util.Arrays;

public class SortTimeCompare {

    public static void main(String[] args) {

        int[] array = new int[10000];
        initArray(array);

        selectionSortTimeChecked(array);

        int[] array2 = new int[10000];
        initArray(array2);

        javaStandardLibrarySortTimeChecked(array2);

    }

    private static void selectionSortTimeChecked(int[] array) {
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < array.length - 1; i++) {
            int min_index = i;

            for(int j = i + 1; j < array.length; j++) {
                if(array[j] < array[min_index]) {
                    min_index = j;
                }
            }

            int temp = array[min_index];
            array[min_index] = array[i];
            array[i] = temp;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("선택 정렬: " + (endTime - startTime));
    }

    private static void javaStandardLibrarySortTimeChecked(int[] array2) {
        long startTime2 = System.currentTimeMillis();
        Arrays.sort(array2);
        long endTime2 = System.currentTimeMillis();
        System.out.println("자바 기본 정렬 라이브러리 시간: " + (endTime2 - startTime2));
    }

    private static void initArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100) + 1;
        }
    }
}
