import java.util.*;
class Student {
    int roll;
    String name;
    double cgpa;

    public Student(int roll, String name, double cgpa) {
        this.roll = roll;
        this.name = name;
        this.cgpa = cgpa;
    }
}

public class Program3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        int n = sc.nextInt();
        Student[] students = new Student[n];
        double minCgpa = Double.MAX_VALUE;
        String lowestCgpaStudent = "";

        for (int i = 0; i < n; i++) {
            System.out.println("Enter roll, name, and CGPA of student " + (i + 1) + ":");
            int roll = sc.nextInt();
            String name = sc.next();
            double cgpa = sc.nextDouble();
            students[i] = new Student(roll, name, cgpa);

            if (cgpa < minCgpa) {
                minCgpa = cgpa;
                lowestCgpaStudent = name;
            }
        }

        System.out.println("Details of Students:");
        for (Student student : students) {
            System.out.println("Roll: " + student.roll + ", Name: " + student.name + ", CGPA: " + student.cgpa);
        }
        System.out.println("Student with lowest CGPA: " + lowestCgpaStudent);
    }
}
