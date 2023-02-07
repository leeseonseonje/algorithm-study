package thisiscodingtest.sort.training;

import java.util.*;

public class StudentGrades {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            students.add(new Student(scanner.next(), scanner.nextInt()));
        }

        Collections.sort(students);
        students.forEach(System.out::println);
    }


    static class Student implements Comparable<Student> {
        String name;

        int grade;

        public Student(String name, int grade) {
            this.name = name;
            this.grade = grade;
        }

        @Override
        public int compareTo(Student o) {
            return Integer.compare(this.grade, o.grade);
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", grade=" + grade +
                    '}';
        }
    }
}
