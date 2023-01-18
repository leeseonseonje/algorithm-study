package yeongdong;

public class A2B2C2 {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Solution solution = new Solution();
        int solution1 = solution.solution(5);
        System.out.println("solution1 = " + solution1);
        long end = System.currentTimeMillis();
        System.out.println("수행시간: " + (end - start) + "ms");//두 시간에 차 계산
    }
}

class Solution {

    public int solution(int b) {
        int result = 500000;

        for (int a = 1; a <= b; a++) {
            double c = pythagorasTheorem(a, b);

            if (isInteger(c)) {
                result = (int) c;
                break;
            }
        }
        return isResult(result);
    }

    private double pythagorasTheorem(int a, int b) {
        double c = (Math.pow(a, 2) + Math.pow(b, 2));
        return Math.sqrt(c);
    }

    private int isResult(int result) {
        return result >= 500000L ? -1 : result;
    }

    private boolean isInteger(double c) {
        return c % 1 == 0;
    }

}
