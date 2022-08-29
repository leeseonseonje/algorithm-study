package thisiscodingtest.dfsbfs;

public class Dfs {

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
        dfs(graph, 1, visited);
    }

    public static void dfs(int[][] graph, int n, boolean[] visited) {

        visited[n] = true;
        System.out.println(n + ", ");
        for (int i : graph[n]) {
            if (!visited[i]) {
                dfs(graph, i, visited);
            }
        }
    }


}
