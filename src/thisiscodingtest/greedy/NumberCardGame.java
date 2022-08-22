package thisiscodingtest.greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class NumberCardGame {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        int[] cardNumbers = rowMin(scan, n, m);

        Arrays.sort(cardNumbers);
        System.out.println(cardNumbers[cardNumbers.length-1]);
    }

    private static int[] rowMin(Scanner scan, int n, int m) {
        int[] cardNumbers = new int[n];
        int min = 10001;

        for (int i = 0; i < cardNumbers.length; i++) {
            for (int j = 0; j < m; j++) {
                min = Math.min(min, scan.nextInt());
            }
            cardNumbers[i] = min;
            min = 10001;
        }

        return cardNumbers;
    }
}
