package baekjoon;

import java.util.Scanner;

public class NO9012 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();

        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            String next = scanner.next();
            int count = 0;
            for (int j = 0; j < next.length(); j++) {
                if (next.charAt(j) == '(') {
                    ++count;
                } else if (next.charAt(j) == ')') {
                    --count;
                }
                if (count < 0) {
                    result[i] = "NO";
                }
            }
            if (count != 0) {
                result[i] = "NO";
            } else if (result[i] == null){
                result[i] = "YES";
            }
        }

        for (String s : result) {
            System.out.println(s);
        }
    }
}
