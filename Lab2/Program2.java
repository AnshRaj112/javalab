public class Program2 {
    public static void main(String[] args) {
        if (args.length != 10) { 
            System.out.println("Please provide exactly ten numbers as command-line arguments.");
            return; 
        }

        int[] numbers = new int[10]; 
        int evenCount = 0, oddCount = 0; 
            for (int i = 0; i < 10; i++) {
                numbers[i] = Integer.parseInt(args[i]); 
            }

            for (int num : numbers) { 
                if (num % 2 == 0) { 
                    evenCount++; 
                } else {
                    oddCount++; 
                }
            }

            System.out.println("Number of even numbers: " + evenCount); 
            System.out.println("Number of odd numbers: " + oddCount); 
    }
}
