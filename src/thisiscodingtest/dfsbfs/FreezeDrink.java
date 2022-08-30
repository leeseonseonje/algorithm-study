package thisiscodingtest.dfsbfs;

import java.util.Scanner;

public class FreezeDrink {

    public static void main(String[] args) {
        int[][] iceFrame = inputData();
        String[] directions = {"-1,0", "0,1", "1,0", "0,-1"};

    }

    private static void dfs(int[][] iceFrame, int[][] directions, int n) {


    }

    private static int[][] inputData() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        int[][] iceFrame = new int[n][m];

        for (int i = 0; i < iceFrame.length; i++) {
            for (int j = 0; j < iceFrame[i].length; j++) {
                iceFrame[i][j] = scan.nextInt();
            }
        }
        return iceFrame;
    }
}
