package thisiscodingtest.implement;

import java.util.Scanner;

public class GameDevelop {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();
        int[][] map = new int[x][y];

        int row = scan.nextInt();
        int column = scan.nextInt();
        int direction = scan.nextInt();

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = scan.nextInt();
            }
        }

        String[] steps = {"-1,0", "0,1", "1,0", "0,-1"};
        int count = 1;
        int loop = 0;
        while (true) {
            String[] split = steps[direction].split(",");
            if (row + Integer.parseInt(split[0]) >= 1 && row + Integer.parseInt(split[0]) <= x
                    && column + Integer.parseInt(split[1]) >= 1 && column + Integer.parseInt(split[1]) <= y) {
                int i = map[column + Integer.parseInt(split[1])][row + Integer.parseInt(split[0])];
                if (i == 0) {
                    count++;
                    map[column + Integer.parseInt(split[1])][row + Integer.parseInt(split[0])] = 2;
                    row = row + Integer.parseInt(split[0]);
                    column = column + Integer.parseInt(split[1]);
                    loop = 0;
                    continue;
                } else {
                    direction++;
                }
            } else {
                direction++;
            }
            if (direction == 4) {
                loop++;
                direction = 0;
            }
            if (loop == 2) {
                break;
            }
        }
        System.out.println(count);
    }
}
