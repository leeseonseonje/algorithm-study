package thisiscodingtest.dfsbfs;

import java.util.Scanner;

public class FreezeDrink {

    private static int n, m;

    private static int[][] iceFrame;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();

        iceFrame = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                iceFrame[i][j] = scan.nextInt();
            }
        }

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
    public static boolean dfs(int x, int y) {
        if (x <= -1 || x >= n || y <= -1 || y >= m) {
            return false;
        }

        if (iceFrame[x][y] == 0) {
            iceFrame[x][y] = 1;
            dfs(x - 1, y);
            dfs(x + 1, y);
            dfs(x, y - 1);
            dfs(x, y + 1);
            return true;
        } else {
            return false;
        }
    }
}
