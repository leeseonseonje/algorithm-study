package baekjoon;

import java.util.*;

public class NO1026 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
        }
        for (int i = 0; i < n; i++) {
            b.add(scanner.nextInt());
        }

        int[] result = new int[a.size()];

        Collections.sort(a, Collections.reverseOrder());
        Collections.sort(b);

        int sum = 0;
        for (int i = 0; i < result.length; i++) {
            sum = sum + (a.get(i) * b.get(i));
        }
        System.out.println(sum);
    }
}
