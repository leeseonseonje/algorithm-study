package programmers;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class ReportResult {

    public static final String[] id_list = {"muzi", "frodo", "apeach", "neo"};
    public static final String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
    public static final int k = 2;

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0, n = report.length; i < n; i++) {
            Integer count = map.getOrDefault(reportSplit(report[i],1), 0);
            map.put(reportSplit(report[i], 1), ++count);
        }

        map.keySet().forEach(e -> System.out.println(e + " : " + map.get(e)));


    }

    public static String reportSplit(String report, int index) {
        return report.split(" ")[index];
    }
}