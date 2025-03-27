import java.util.*;

class Program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your roll number: ");
        String rollNo = scanner.nextLine();

        System.out.print("Enter your section: ");
        String section = scanner.nextLine();

        System.out.print("Enter your branch: ");
        String branch = scanner.nextLine();

        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Section: " + branch + " - " + section);
        System.out.println("Branch: " + branch);

        scanner.close();
    }
}
