package thisiscodingtest.greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import static java.util.Collections.*;

public class BigNumberRule {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int k = scan.nextInt();

        Integer[] numbers = initArray(scan, n);

        Arrays.sort(numbers, reverseOrder());

        int result = bigNumberPlus(m, k, numbers);
        System.out.println(result);

        int deepResult = deep(m, k, numbers);
        System.out.println(deepResult);
    }

    private static Integer[] initArray(Scanner scan, int n) {
        Integer[] numbers = new Integer[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextInt();
        }
        return numbers;
    }

    private static int bigNumberPlus(int m, int k, Integer[] numbers) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < m; i++) {
            if (count < k) {
                sum += numbers[0];
                count += 1;
            } else {
                count = 0;
                sum += numbers[1];
            }
        }
        return sum;
    }

    private static int deep(int m, int k, Integer[] numbers) {
        int count = m / (k + 1) * k;
        count += m % (k + 1);

        int sum = numbers[0] * count;
        sum += numbers[1] * (m - count);
        return sum;
    }
}
