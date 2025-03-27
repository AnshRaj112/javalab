import java.util.*;
class Box {
	double length, width, height;
	
	public Box(double length, double width, double height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}
		
	public double volume(){
		return length*width*height;
	}
}

public class Program1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 System.out.println("Enter length, width, and height of the box:");
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        double height = sc.nextDouble();

        Box box = new Box(length, width, height);
        System.out.println("Volume of the box: " + box.volume());
    }
}
