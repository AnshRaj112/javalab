import java.util.Scanner;

class Apple {
    private String message;

    public Apple(String message) {
        this.message = message;
    }

    public void show() {
        System.out.println(message);
    }
}

class Banana extends Apple {
    public Banana(String message) {
        super(message);
    }
}

class Cherry extends Apple {
    public Cherry(String message) {
        super(message);
    }
}

public class Program3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the message for Apple class:");
        String appleMessage = scanner.nextLine();

        System.out.println("Enter the message for Banana class:");
        String bananaMessage = scanner.nextLine();

        System.out.println("Enter the message for Cherry class:");
        String cherryMessage = scanner.nextLine();

        Apple apple = new Apple(appleMessage);
        Banana banana = new Banana(bananaMessage);
        Cherry cherry = new Cherry(cherryMessage);

        System.out.println("\nDisplaying messages:");
        apple.show();
        banana.show();
        cherry.show();

        scanner.close();
    }
}