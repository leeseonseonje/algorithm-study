package baekjoon;

import java.util.*;

public class NO11650 {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        List<Pointer> list = new ArrayList<>();

        int loop = scan.nextInt();
        for (int i = 0; i < loop; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            list.add(new Pointer(x, y));
        }



        Collections.sort(list);
        list.forEach(System.out::println);
    }
}

class Pointer implements Comparable<Pointer> {

    private int x;
    private int y;

    public Pointer(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return x + " " + y;
    }

    @Override
    public int compareTo(Pointer pointer) {
        if (this.x == pointer.getX()) {
            return this.y - pointer.getY();
        }
        return this.x - pointer.getX();
    }
}
