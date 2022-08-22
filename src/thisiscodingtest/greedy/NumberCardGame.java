package thisiscodingtest.greedy;

import java.util.Scanner;

public class NumberCardGame {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        int result = columnMaxRowMin(scan, n, m);

        System.out.println(result);

    }

    private static int columnMaxRowMin(Scanner scan, int n, int m) {
        int min = 10001;
        int max = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                min = Math.min(min, scan.nextInt());
            }
            max = Math.max(max, min);
            min = 10001;
        }
        return max;
    }
}
