package thisiscodingtest.implement;

import java.util.Scanner;

public class Time {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int count = 0;

        for (int h = 0; h <= n; h++) {
            for (int m = 0; m < 60; m++) {
                for (int s = 0; s < 60; s++) {
                    if (threeContains(h, m, s)) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }

    private static boolean threeContains(int h, int m, int s) {
        return String.valueOf(s).contains("3")
                || String.valueOf(m).contains("3")
                || String.valueOf(h).contains("3");
    }
}
