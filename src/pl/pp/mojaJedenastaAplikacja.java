package pl.pp;

import java.util.*;

public class mojaJedenastaAplikacja {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("11223", "Marek", "Zieliński", Arrays.asList(3, 4, 5, 4)),
                new Student("44556", "Ewa", "Jankowska", Arrays.asList(5, 4, 5, 5)),
                new Student("78901", "Tomasz", "Lewandowski", Arrays.asList(3, 2, 3, 3)),
                new Student("33445", "Magdalena", "Szymańska", Arrays.asList(4, 5, 4, 5))
        );

        Student topStudent = students.get(0);
        double maxAverage = topStudent.getAverageGrade();
        for (Student student : students) {
            if (student.getAverageGrade() > maxAverage) {
                maxAverage = student.getAverageGrade();
                topStudent = student;
            }
        }
        System.out.printf("Student z najwyższą średnią: %s %s (%s) - Average: %.2f%n",
                topStudent.getFirstName(), topStudent.getLastName(), topStudent.getIndexNumber(), maxAverage);

        double totalAverage = 0;
        for (Student student : students) {
            totalAverage += student.getAverageGrade();
        }
        totalAverage /= students.size();
        System.out.printf("Średnia ocen wszystkich studentów: %.2f%n", totalAverage);

        System.out.println("Studenci posortowani według nazwisk:");
        List<Student> sortedStudents = new ArrayList<>(students);
        sortedStudents.sort(Comparator.comparing((Student s) -> s.getLastName()));
        for (Student student : sortedStudents) {
            System.out.printf("%s %s (%s) - Average: %.2f%n",
                    student.getFirstName(), student.getLastName(), student.getIndexNumber(), student.getAverageGrade());
        }
    }
}

class Student {
    private String indexNumber;
    private String firstName;
    private String lastName;
    private List<Integer> grades;

    public Student(String indexNumber, String firstName, String lastName, List<Integer> grades) {
        this.indexNumber = indexNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = new ArrayList<>(grades);
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public double getAverageGrade() {
        if (grades.isEmpty()) return 0;
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
}