package thisiscodingtest.dfsbfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MazeEscape {

    private static int n, m;

    private static int[][] maze;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();

        maze = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                maze[i][j] = scan.nextInt();
            }
        }

        bfs();
    }

    public static void bfs() {
        int[] dx = { -1, 1, 0, 0 };
        int[] dy = { 0, 0, -1, 1 };

        Queue<Node> queue = new LinkedList<>();

        queue.add(new Node(0, 0));

        while(!queue.isEmpty()) {
            Node node = queue.poll();

            for (int i = 0; i < 4; i++) {
                int x = node.x + dx[i];
                int y = node.y + dy[i];

                if (x <= -1 || x >= n || y <= -1 || y >= m) {
                    continue;
                } else {
                    if (maze[x][y] == 1) {
                        maze[x][y] = maze[node.x][node.y] + 1;
                        queue.add(new Node(x, y));
                    }
                }
            }
        }
        System.out.println(maze[n - 1][m - 1]);
    }
}

class Node {
    int x;

    int y;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
