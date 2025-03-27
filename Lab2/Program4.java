import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the number of elements:"); 
        int n = sc.nextInt();
        int[] numbers = new int[n];

        System.out.println("Enter the numbers:"); 
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) { 
            if (numbers[i] == Integer.MIN_VALUE) continue;

            int count = 1; 
            for (int j = i + 1; j < n; j++) { 
                if (numbers[i] == numbers[j]) { 
                    count++; 
                    numbers[j] = Integer.MIN_VALUE; 
                }
            }
            System.out.println("Occurrence of " + numbers[i] + " = " + count); 
        }
        sc.close(); 
    }
}

