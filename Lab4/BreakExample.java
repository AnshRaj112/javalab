public class BreakExample {
    public static void main(String[] args) {
        outerLoop: // Label for the outer loop
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("i = " + i + ", j = " + j);
                if (j == 6) {
                    break outerLoop; // Breaks out of the outer loop when j == 3
                }
            }
        }
        System.out.println("Outer loop has been broken out of.");
    }
}