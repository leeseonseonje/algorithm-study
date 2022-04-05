package programmers.level1.keypad;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Keypad {

    public static int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
    public static String hand = "left";

    public static void main(String[] args) {


        List<String> list = new ArrayList<>();

        int leftIndex = 10;
        int rightIndex = 12;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                numbers[i] = 11;
            }
            if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                list.add("L");
                leftIndex = numbers[i];
            } else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
                list.add("R");
                rightIndex = numbers[i];
            } else {
                int left = (Math.abs((leftIndex - numbers[i])) / 3) + (Math.abs((leftIndex - numbers[i])) % 3);
                int right = (Math.abs((rightIndex - numbers[i])) / 3) + (Math.abs((rightIndex - numbers[i])) % 3);
                System.out.println("left = " + left);
                System.out.println("right = " + right);
                System.out.println("numbers = " + numbers[i]);
                if (left == right) {
                    if (hand.equals("left")) {
                        list.add("L");
                        leftIndex = numbers[i];
                    } else {
                        list.add("R");
                        rightIndex = numbers[i];
                    }
                } else if (left == 1) {
                    System.out.println("numbers22 = " + numbers[i]);
                    list.add("L");
                    leftIndex = numbers[i];
                } else {
                    list.add("R");
                    rightIndex = numbers[i];
                }
            }
        }
        String collect = list.stream().collect(Collectors.joining());
        System.out.println(collect);
    }
}

