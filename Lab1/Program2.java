import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner mark = new Scanner(System.in); //Scanner scanner_name = new Scanner(System.in)
        
        System.out.print("Enter marks: ");
        int marks = mark.nextInt();
        char grade;

        if (marks >= 90) {
            grade = 'O';
        } else if (marks >= 80) {
            grade = 'E';
        } else if (marks >= 70) {
            grade = 'A';
        } else if (marks >= 60) {
            grade = 'B';
        } else if (marks >= 50) {
            grade = 'C';
        } else if (marks >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Grade: " + grade);
        mark.close(); //scanner name .close
    }
}
