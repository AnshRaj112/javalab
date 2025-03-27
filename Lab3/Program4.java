import java.util.*;
class Calculator {
    public int subtract(int a, int b) {
        return a - b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public int subtract(int a, int b, int c) {
        return a - b - c;
    }
}

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        // Subtracting two integers
        System.out.println("Enter two integers to subtract:");
        int int1 = sc.nextInt();
        int int2 = sc.nextInt();
        System.out.println("Result of subtracting integers: " + calc.subtract(int1, int2));

        // Subtracting two doubles
        System.out.println("Enter two doubles to subtract:");
        double double1 = sc.nextDouble();
        double double2 = sc.nextDouble();
        System.out.println("Result of subtracting doubles: " + calc.subtract(double1, double2));

        // Subtracting three integers
        System.out.println("Enter three integers to subtract:");
        int int3 = sc.nextInt();
        int int4 = sc.nextInt();
        int int5 = sc.nextInt();
        System.out.println("Result of subtracting three integers: " + calc.subtract(int3, int4, int5));
    }
}
