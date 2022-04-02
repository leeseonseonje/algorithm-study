package baekjoon;

import java.util.*;

public class NO1158 {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scan.nextInt();
        int k = scan.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        List<Integer> list = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        int target = 1;
        while (queue.size() > 0) {
            if (target == k) {
                Integer remove = queue.remove();
                list.add(remove);
                target = 1;
            } else {
                target++;
                Integer poll = queue.poll();
                queue.add(poll);
            }
        }
        System.out.print("<");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size()-1) {
                System.out.print(list.get(i));
            } else {
                System.out.print(list.get(i) + ", ");
            }
        }
        System.out.print(">");
    }
}
