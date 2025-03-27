interface Motor {
    int capacity = 10;

    void run();       
    void consume();  
}

class WashingMachine implements Motor {

    public void run() {
        System.out.println("Motor is running.");
    }

    public void consume() {
        System.out.println("Motor is consuming energy.");
    }
    public void displayCapacity() {
        System.out.println("Capacity of the motor is " + capacity);
    }
}
public class Program2 {
    public static void main(String[] args) {
        WashingMachine machine = new WashingMachine();
        machine.displayCapacity();
    }
}
