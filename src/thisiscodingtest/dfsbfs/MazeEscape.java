package thisiscodingtest.dfsbfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
5 6
1 0 1 0 1 0
1 1 1 1 1 1
0 0 0 0 0 1
1 1 1 1 1 1
1 1 1 1 1 1
*/
public class MazeEscape {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] graph = new int[n][m];
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                graph[i][j] = scanner.nextInt();
            }
        }

        bfs(graph, n, m);
    }

    public static void bfs(int[][] graph, int n, int m) {
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(0, 0));

        int[] moveX = {-1, 1, 0, 0};
        int[] moveY = {0, 0, -1, 1};

        while (!queue.isEmpty()) {
            Point point = queue.poll();
            for (int i = 0; i < moveX.length; i++) {
                int px = point.x + moveX[i];
                int py = point.y + moveY[i];
                if (px <= -1 || px >= n || py <= -1 || py >= m) {
                    continue;
                }

                int node = graph[px][py];
                if (px == 0 && py == 0) {
                    continue;
                }

                if (node == 1) {
                    graph[px][py] = graph[point.x][point.y] + 1;
                    queue.add(new Point(px, py));
                }
            }
        }
        System.out.println("result = " + graph[n - 1][m - 1]);
    }

    static class Point {

        int x;

        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

}
