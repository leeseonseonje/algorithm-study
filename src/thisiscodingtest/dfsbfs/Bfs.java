package thisiscodingtest.dfsbfs;

import java.util.LinkedList;
import java.util.Queue;

public class Bfs {
    public static void main(String[] args) {
        int[][] graph = {
                {},
                {2, 3, 8},
                {1, 7},
                {1, 4, 5},
                {3, 5},
                {3, 4},
                {7},
                {2, 6, 8},
                {1, 7}
        };
        boolean[] visited = new boolean[graph.length];

        bfs(graph, 1, visited);
    }

    public static void bfs(int[][] graph, int start, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            Integer poll = queue.poll();
            System.out.println(poll + ", ");

            for (int i : graph[poll]) {
                if (!visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}
