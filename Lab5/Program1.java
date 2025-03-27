import java.util.Scanner;

abstract class Student {
    int rollNo;
    long regNo;
    
    public void getInput(int rollNo, long regNo) {
        this.rollNo = rollNo;
        this.regNo = regNo;
    }
    
    abstract void course();
}

class Kiitian extends Student {
    void course() {
        System.out.println("Course - B.Tech. (Computer Science & Engg)");
    }
    
    public void printDetails() {
        System.out.println("Rollno - " + rollNo);
        System.out.println("Registration no - " + regNo);
        course();
    }
}

public class Program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Kiitian kiitian = new Kiitian();

        System.out.print("Enter Roll Number: ");
        int rollNo = scanner.nextInt();

        System.out.print("Enter Registration Number: ");
        long regNo = scanner.nextLong();

        kiitian.getInput(rollNo, regNo);

        kiitian.printDetails();

        scanner.close();
    }
}
