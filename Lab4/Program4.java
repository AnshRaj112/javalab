import java.util.*;

class Account {
    int acc_no;
    double balance;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Number:");
        acc_no = sc.nextInt();
        sc.nextLine(); // Consume the newline character after reading the number
        System.out.println("Enter Balance:");
        balance = sc.nextDouble();
        sc.nextLine(); // Consume the newline character after reading the double
    }

    public void disp() {
        System.out.println("Account Number: " + acc_no);
        System.out.println("Balance: Rs " + balance);
    }
}

class Person extends Account {
    String name;
    String aadhar_no;

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name:");
        name = sc.nextLine();
        System.out.println("Enter Aadhar Number:");
        aadhar_no = sc.nextLine();
    }

    @Override
    public void disp() {
        super.disp();
        System.out.println("Name: " + name);
        System.out.println("Aadhar Number: " + aadhar_no);
    }
}

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of persons:");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        Person[] persons = new Person[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            persons[i] = new Person();
            persons[i].input();
        }

        System.out.println("\nDisplaying details of all persons:");
        for (Person person : persons) {
            person.disp();
            System.out.println();
        }
    }
}
