package programmers.level1.lotto;

import java.util.Arrays;

public class LottoRank {

    static int[] lottos = {31, 10, 45, 1, 6, 19};
    static int[] win_nums = {31, 10, 45, 1, 6, 19};

    public static void main(String[] args) {

        int zeroCount = (int) Arrays.stream(lottos).filter(lotto -> lotto == 0).count();

        int winCount = (int) Arrays.stream(lottos)
                .filter(lotto -> Arrays.stream(win_nums).anyMatch(win_num -> lotto == win_num))
                .count();

        int maxRank = 1;
        int minRank = 6;
        maxRank += lottos.length - (winCount + zeroCount);
        minRank = maxRank + (zeroCount - 1);

        System.out.println(maxRank);
        System.out.println(minRank);
        int[] result = {maxRank, minRank};
    }
}
