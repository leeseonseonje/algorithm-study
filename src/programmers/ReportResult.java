package programmers;

import java.util.*;

import static java.util.stream.Collectors.*;

public class ReportResult {

    public static final String[] id_list = {"muzi", "frodo", "apeach", "neo"};
    public static final String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
    public static final int k = 2;

    public static void main(String[] args) {

        Set<Report> reports = Arrays.stream(report)
                .map(r -> new Report(reportSplit(r, 0), reportSplit(r, 1)))
                .collect(toSet());

        System.out.println(reports);

        Map<String, Integer> map = new HashMap<>();
        for (Report r : reports) {
            Integer count = map.getOrDefault(r.getTroll(), 0);
            map.put(r.getTroll(), ++count);
        }

        map.keySet().forEach(e -> System.out.println(e + " : " + map.get(e)));

        Map<String, Integer> m = new HashMap<>();

        for (String s : map.keySet()) {
            if (map.get(s) >= k) {
                for (Report r : reports) {
                    if (s.equals(r.getTroll())) {
                        Integer count = m.getOrDefault(r.getCleanUser(), 0);
                        m.put(r.getCleanUser(), ++count);
                    }
                }
            }
        }

        m.keySet().forEach(e -> System.out.println(e + " : " + m.get(e)));
        int[] result = new int[id_list.length];

        for (int i = 0; i < result.length; i++) {
            if (m.get(id_list[i]) == null) {
                result[i] = 0;
            } else {
                result[i] = m.get(id_list[i]);
            }
            System.out.println(result[i]);
        }

    }

    public static String reportSplit(String report, int index) {
        return report.split(" ")[index];
    }
}

class Report {

    private String cleanUser;
    private String troll;

    public Report(String cleanUser, String troll) {
        this.cleanUser = cleanUser;
        this.troll = troll;
    }

    public String getCleanUser() {
        return cleanUser;
    }

    public String getTroll() {
        return troll;
    }

    @Override
    public String toString() {
        return "Report{" +
                "cleanUser='" + cleanUser + '\'' +
                ", troll='" + troll + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Report report = (Report) o;
        return Objects.equals(cleanUser, report.cleanUser) && Objects.equals(troll, report.troll);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cleanUser, troll);
    }
}