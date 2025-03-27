import java.util.*;
class Rectangle {
    double length, breadth;

    public Rectangle() {
        this.length = 0;
        this.breadth = 0;
    }

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea() {
        return length * breadth;
    }

    public void displayArea() {
        System.out.println("Area of Rectangle: " + calculateArea());
    }
}

public class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length and breadth of the rectangle:");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
		
		Rectangle defaultRectangle = new Rectangle();
        System.out.println("Default Rectangle Area: " + defaultRectangle.calculateArea());

        Rectangle rectangleWithInput = new Rectangle(length, breadth);
        rectangleWithInput.displayArea();
    }
}
