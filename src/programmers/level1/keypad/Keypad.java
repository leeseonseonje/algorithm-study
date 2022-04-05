package programmers.level1.keypad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Keypad {

    public static int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
    public static String hand = "right";

    public static void main(String[] args) {


        List<String> list = new ArrayList<>();

        int leftIndex = 10;
        int rightIndex = 100;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                list.add("L");
                leftIndex = numbers[i];
            } else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
                list.add("R");
                rightIndex = numbers[i];
            } else {
                System.out.println("LEFT " + leftIndex);
                System.out.println("RIGHT " + rightIndex);
                System.out.println("INDEX " + numbers[i]);
                int left = Math.abs(leftIndex - numbers[i]);
                int right = Math.abs(rightIndex - numbers[i]);
                if (left == 1 || left == 3) {
                    if (hand.equals("left")) {
                        list.add("L");
                        leftIndex = numbers[i];
                    }
                } else if (right == 1 || right == 3) {
                    if (hand.equals("right")) {
                        list.add("R");
                        rightIndex = numbers[i];
                    }
                } else if (left == right) {
                    if (hand.equals("left")) {
                        list.add("L");
                        leftIndex = numbers[i];
                    } else {
                        list.add("R");
                        rightIndex = numbers[i];
                    }
                } else if (left == 2 && right != 2) {
                    list.add("R");
                    rightIndex = numbers[i];
                } else {
                    list.add("L");
                    leftIndex = numbers[i];
                }
            }
        }
        list.forEach(System.out::print);
        // LRLLLRLLRRL 답
        // LRLLLRLLLR 내
    }
}

enum Hand {
    L (1, 4, 7),
    R (3, 6, 9);

    private int a;
    private int b;
    private int c;

    Hand(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
}
