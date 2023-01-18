package thisiscodingtest.dfsbfs;

import java.util.Arrays;
import java.util.Scanner;

/*4 5
0 0 1 1 0
0 0 0 1 1
1 1 1 1 1
0 0 0 0 0*/
public class FreezingDrinks {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();
        int[][] graph = new int[x][y];

        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                graph[i][j] = scan.nextInt();
            }
        }

        int result = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (dfs(graph, i, j)) {
                    result++;
                }
            }
        }
        System.out.println(result);
    }

    public static boolean dfs(int[][] graph, int x, int y) {

        if (x <= -1 || x >= graph.length || y <= -1 || y >= graph[0].length) {
            return false;
        }
        if (graph[x][y] == 0) {
            graph[x][y] = 1;
            dfs(graph, x - 1, y);
            dfs(graph, x + 1, y);
            dfs(graph, x, y - 1);
            dfs(graph, x, y + 1);
            return true;
        } else {
            return false;
        }
    }
}
