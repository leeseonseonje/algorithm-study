package baekjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NO6603 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            List<Integer> pick = new ArrayList<>();
            List<Integer> lotto = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                pick.add(sc.nextInt());
            }
            for (int i = 0; i < pick.size(); i++) {
                boolean[] visited = new boolean[pick.size()];
                if (!visited[i]) {
                    dfs("",i, visited, pick, lotto, 6);
                }
            }
            if (sc.nextInt() == 0) break;
        }
    }

    static void dfs(String init, int start, boolean[] visited, List<Integer> pick, List<Integer> lotto, int limit) {
//        if (lotto.size() == limit) {
//            return;
//        }

        if(init.length() == limit) {
//            System.out.println(init);
            char[] chars = init.toCharArray();
            Arrays.sort(chars);
            for(int i = 0; i < chars.length; i++) {
                System.out.print(chars[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = start; i < pick.size(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                String temp = init + String.valueOf(pick.get(i));
//                lotto.add(pick.get(i));
                dfs(temp,start + 1, visited, pick, lotto, limit);
                visited[i] = false;
            }
        }
    }
}

