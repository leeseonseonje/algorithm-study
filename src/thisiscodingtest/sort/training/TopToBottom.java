package thisiscodingtest.sort.training;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TopToBottom {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Integer n = scanner.nextInt();

        Integer[] array = new Integer[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array, Collections.reverseOrder());

        System.out.println(Arrays.toString(array));
    }
}
