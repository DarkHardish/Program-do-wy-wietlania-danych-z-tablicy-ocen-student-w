import java.util.Arrays;
import java.util.Comparator;

public class Main {

    static class Student {
        String name;
        String surname;
        int groupNumber;
        int[] learningResults;

        public Student(String name, String surname, int groupNumber, int[] learningResults) {
            this.name = name;
            this.surname = surname;
            this.groupNumber = groupNumber;
            this.learningResults = learningResults;
        }

        public double getAverageScore() {
            int sum = 0;
            for (int score : learningResults) {
                sum += score;
            }
            return (double) sum / learningResults.length;
        }
    }

    public static void main(String[] args) {

        Student[] students = new Student[10];
        students[0] = new Student("John", "Smith", 1, new int[] {3, 4, 5, 4, 3});
        students[1] = new Student("Jane", "Doe", 2, new int[] {5, 5, 5, 5, 5});
        students[2] = new Student("Bob", "Johnson", 3, new int[] {2, 2, 2, 2, 2});
        students[3] = new Student("Alice", "Williams", 4, new int[] {4, 4, 4, 4, 4});
        students[4] = new Student("Tom", "Brown", 5, new int[] {1, 1, 1, 1, 1});
        students[5] = new Student("Mary", "Jones", 6, new int[] {3, 4, 5, 4, 5});
        students[6] = new Student("Mike", "Miller", 7, new int[] {5, 4, 3, 2, 1});
        students[7] = new Student("Sue", "Jackson", 8, new int[] {2, 2, 3, 4, 5});
        students[8] = new Student("Greg", "Taylor", 9, new int[] {4, 5, 4, 5, 4});
        students[9] = new Student("Kim", "Lee", 10, new int[] {1, 1, 2, 3, 4});

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Double.compare(s1.getAverageScore(), s2.getAverageScore());
            }
        });

        for (Student s : students) {
            System.out.println("Name: " + s.name + " " + s.surname + ", Group number: " + s.groupNumber + ", Average score: " + s.getAverageScore());
        }

        System.out.println("\nStudents with grades of 4 or 5:");
        for (Student s : students) {
            boolean hasGoodGrades = false;
            for (int grade : s.learningResults) {
                if (s.getAverageScore() >= 4) {
                    hasGoodGrades = true;
                    System.out.println("Name: " + s.name + " " + s.surname + ", Group number: " + s.groupNumber + ", Average score: " + s.getAverageScore());
                    break;


                }
        }}}}