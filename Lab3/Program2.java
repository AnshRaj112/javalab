import java.util.*;
class Rectangle {
    double length, breadth;

    public void read(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea() {
        return length * breadth;
    }

    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }

    public void display() {
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length and breadth of the rectangle:");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();

        Rectangle rectangle = new Rectangle();
        rectangle.read(length, breadth);
        rectangle.display();
    }
}
