package thisiscodingtest.dfsbfs;

import java.util.Arrays;

public class AdjacencyMatrix {

    static final int INF = 999999999;
    public static void main(String[] args) {

        int[][] graph = {
                {0, 7, 5},
                {7, 0, INF},
                {5, INF, 0}
        };

        System.out.println(Arrays.deepToString(graph));
    }
}
