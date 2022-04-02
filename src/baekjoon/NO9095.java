package baekjoon;

import java.util.Scanner;

public class NO9095 {
    static int[] result = new int[1000];

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            logic((scanner.nextInt()));
        }
    }
    
    static void logic(int n) {
        result[1] = 1;
        result[2] = 2;
        result[3] = 4;

        for (int i = 4; i <= n; i++) {
            result[i] = result[i - 1] + result[i - 2] + result[i - 3];
        }
        System.out.println(result[n]);
    }
}

