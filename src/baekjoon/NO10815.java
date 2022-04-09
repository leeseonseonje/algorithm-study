package baekjoon;

import java.util.*;

public class NO10815 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();
        int[] cards = new int[n];
        for (int i = 0; i < n; i++) {
            cards[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] numbers = new int[m];
        for (int i = 0; i < m; i++) {
            numbers[i] = scanner.nextInt();
        }

        int[] result = new int[numbers.length];

        Arrays.sort(cards);

        for (int i = 0; i < numbers.length; i++) {
            int index = Arrays.binarySearch(cards, numbers[i]);
            if (index >= 0) {
                result[i] = 1;
            }
        }

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
