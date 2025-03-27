import java.util.*;
class Shape {
    public double area(double radius) {
        return Math.PI * radius * radius; // Circle
    }

    public double area(double base, double height) {
        return 0.5 * base * height; // Triangle
    }

    public double area(int side) {
        return side * side; // Square
    }
}

public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape shape = new Shape();

        System.out.println("Choose shape to calculate area: 1. Circle 2. Triangle 3. Square");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter radius of the circle:");
                double radius = sc.nextDouble();
                System.out.println("Area of Circle: " + shape.area(radius));
                break;

            case 2:
                System.out.println("Enter base and height of the triangle:");
                double base = sc.nextDouble();
                double height = sc.nextDouble();
                System.out.println("Area of Triangle: " + shape.area(base, height));
                break;

            case 3:
                System.out.println("Enter side of the square:");
                int side = sc.nextInt();
                System.out.println("Area of Square: " + shape.area(side));
                break;

            default:
                System.out.println("Invalid choice!");
        }
    }
}
