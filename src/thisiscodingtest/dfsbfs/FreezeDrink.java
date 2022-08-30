package thisiscodingtest.dfsbfs;

import java.util.Scanner;

public class FreezeDrink {

    private static int n, m;
    private static int[][] iceFrame;

    public static void main(String[] args) {
        iceFrame = inputData();

        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (dfs(i, j)) {
                    result += 1;
                }
            }
        }
        System.out.println(result);
    }

    private static boolean dfs(int x, int y) {
        iceFrame[x][y] = 1;

        if (x <= -1 || x >= n || y <= -1 || y >= n) {
            return false;
        }

        if (iceFrame[x][y] == 0) {
            iceFrame[x][y] = 1;
            dfs(x - 1, y);
            dfs(x, y - 1);
            dfs(x + 1, y);
            dfs(x, y + 1);
            return true;
        }
        return false;
    }

    private static int[][] inputData() {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();

        int[][] iceFrame = new int[n][m];

        for (int i = 0; i < iceFrame.length; i++) {
            for (int j = 0; j < iceFrame[i].length; j++) {
                iceFrame[i][j] = scan.nextInt();
            }
        }
        return iceFrame;
    }
}
