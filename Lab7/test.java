import java.util.Scanner;

public class test {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Fixed Scanner initialization
        
        System.out.println("Enter the name of the player: ");
        String name = sc.nextLine();  // Correct usage
        
        System.out.println("Enter the score of the player: ");
        int score = sc.nextInt();  // Changed `nextLine()` to `nextInt()` for integer input

        // Calculate the high score position
        int position = calculateHighScorePosition(score);

        // Display the high score position
        displayHighScorePosition(name, position);

        sc.close(); // Close scanner to prevent resource leaks
    }

    // Corrected method signature: should return an int
    public static int calculateHighScorePosition(int score) {
        int position;
        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {  // Removed unnecessary `score < 1000`
            position = 2;
        } else if (score >= 100) {  // Removed unnecessary `score < 500`
            position = 3;
        } else {
            position = 4;
        }
        return position;  // Method should return the position
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score list");
    }
}
