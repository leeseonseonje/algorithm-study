package yeongdong;

public class A2B2C2 {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Solution solution = new Solution();
        int solution1 = solution.solution(200001);
        System.out.println("solution1 = " + solution1);
        long end = System.currentTimeMillis();
        System.out.println("수행시간: " + (end - start) + "ms");//두 시간에 차 계산
    }
}

class Solution {

    public int solution(int b) {
        double c = 0L;
        long result = 500000L * 500000L;
        for (int a = 1; c <= result; a++) {
            c = (Math.pow(a, 2) + Math.pow(b, 2));
            if (Math.sqrt(c) % 1 == 0) {
                result = Math.min(result, (int) Math.sqrt(c));
            }
        }
        return result == 500000L * 500000L ? -1 : (int) result;
    }
}
