public class Program1 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Please provide exactly three numbers as command-line arguments.");
            return; 
        }

        int[] numbers = new int[3]; 
            for (int i = 0; i < 3; i++) {
                numbers[i] = Integer.parseInt(args[i]); 
            }

            int largest = numbers[0];
            for (int i = 1; i < numbers.length; i++) { 
                if (numbers[i] > largest) { 
                    largest = numbers[i]; 
                }
            }

            System.out.println("The largest number is: " + largest);
    }
}