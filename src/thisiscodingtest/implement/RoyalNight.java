package thisiscodingtest.implement;

import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.*;
import static java.util.Arrays.*;
import static java.util.stream.Collectors.*;

public class RoyalNight {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String location = scan.nextLine();
        int row = location.charAt(0) - 96;
        int column = parseInt(location.substring(1));

        String[] steps = {"-2,-1", "-1,-2", "1,-2", "2,-1", "2,1", "1,2", "-1,2", "-2,1"};
        int count = 0;

        for (int i = 0; i < steps.length; i++) {
            List<Integer> list = stream(steps[i].split(","))
                    .map(Integer::parseInt)
                    .collect(toList());

            if (row + list.get(0) >= 1 && row + list.get(0) <= 8) {
                if (column + list.get(1) >= 1 && column + list.get(1) <= 8) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
