package thisiscodingtest.sort.training;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Change {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        Integer[] a = new Integer[n];
        Integer[] b = new Integer[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = scanner.nextInt();
        }

        Arrays.sort(a);
        Arrays.sort(b, Collections.reverseOrder());

        for (int i = 0; i < k; i++) {
            a[i] = b[i];
        }

        int result = Arrays.stream(a).mapToInt(i -> i).sum();
        System.out.println(Arrays.toString(a));
        System.out.println(result);
    }
}
