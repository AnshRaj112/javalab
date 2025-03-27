import java.util.*;
class Plate {
    double length, width;

    public Plate(double length, double width) {
        this.length = length;
        this.width = width;
        System.out.println("Plate dimensions: Length = " + length + ", Width = " + width);
    }
}

class Box extends Plate {
    double height;

    public Box(double length, double width, double height) {
        super(length, width);
        this.height = height;
        System.out.println("Box dimensions: Height = " + height);
    }
}

class WoodBox extends Box {
    double thickness;

    public WoodBox(double length, double width, double height, double thickness) {
        super(length, width, height);
        this.thickness = thickness;
        System.out.println("WoodBox thickness: " + thickness);
    }
}

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter dimensions for WoodBox (length, width, height, thickness):");
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        double thickness = sc.nextDouble();
        WoodBox woodBox = new WoodBox(length, width, height, thickness);
    }
}