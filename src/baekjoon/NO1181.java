package baekjoon;

import java.util.*;

public class NO1181 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Set<String> list = new HashSet<>();
        for (int i = 0; i < n+1; i++) {
            list.add(scan.nextLine());
        }

        List<String> words = new ArrayList<>(list);
        Collections.sort(words);

        words.sort(Comparator.comparingInt(String::length));
        words.remove(0);
        for (String word : words) {
            System.out.println(word);
        }
    }
}
