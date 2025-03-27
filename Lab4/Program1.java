class TwoD {
    double length, width;

    public TwoD(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateCost() {
        double area = length * width;
        return area * 40; 
    }
}

class ThreeD extends TwoD {
    double height;

    public ThreeD(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    @Override
    public double calculateCost() {
        double volume = length * width * height;
        return volume * 60;
    }
}

public class Program1 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);


        System.out.println("Enter dimensions for 2D sheet (length and width):");
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        TwoD sheet = new TwoD(length, width);
        System.out.println("Cost of 2D sheet: Rs " + sheet.calculateCost());

        System.out.println("Enter dimensions for 3D box (length, width, height):");
        length = sc.nextDouble();
        width = sc.nextDouble();
        double height = sc.nextDouble();
        ThreeD box = new ThreeD(length, width, height);
        System.out.println("Cost of 3D box: Rs " + box.calculateCost());
    }
}