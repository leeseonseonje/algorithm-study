package thisiscodingtest.dfsbfs;

import java.util.LinkedList;
import java.util.List;

public class AdjacencyList {

    public static void main(String[] args) {
        LinkedList<List<Node>> graph = new LinkedList<>();

        graph.add(0, List.of(new Node(1, 7), new Node(2, 5)));

        graph.add(1, List.of(new Node(0, 7)));

        graph.add(2, List.of(new Node(0, 5)));

        System.out.println(graph);


    }

    static class Node {
        int x;

        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }
}
