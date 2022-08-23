package thisiscodingtest.implement;

import java.util.Scanner;

public class UpDownLeftRight {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        directionMove(scan, n);
    }

    private static void directionMove(Scanner scan, int n) {
        int row = 0;
        int column = 0;

        for (int i = 0; i <= 6; i++) {
            switch (scan.nextLine()) {
                case "L":
                    if (column - 1 > 0) {
                        column--;
                    }
                    break;
                case "R":
                    if (column + 1 <= n) {
                        column++;
                        System.out.println(column);
                    }
                    break;
                case "D":
                    if (row + 1 <= n) {
                        row++;
                        System.out.println(row);
                    }
                    break;
                default:
                    if (row - 1 > 0) {
                        row--;
                        System.out.println(row);
                    }
                    break;
            }
        }
        System.out.println((row+1) + "," + (column+1));
    }
}
