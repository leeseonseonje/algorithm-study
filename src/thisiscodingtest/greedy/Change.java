package thisiscodingtest.greedy;

import java.util.Scanner;

public class Change {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("돈: ");
        int money = scan.nextInt();

        int[] coins = {500, 100, 50, 10};

        int count = 0;
        for (int coin : coins) {
            count += money / coin;
            money %= coin;
        }
        System.out.println(count);
    }
}
