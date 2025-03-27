import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the matrix: "); 
        int n = sc.nextInt(); 

        int[][] matrix = new int[n][n]; 

        System.out.println("Enter elements of a nxn matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) { 
                matrix[i][j] = sc.nextInt();
            }
        }

        int leftDiagonalSum = 0, rightDiagonalSum = 0; 
        for (int i = 0; i < n; i++) { 
            leftDiagonalSum += matrix[i][i];
            rightDiagonalSum += matrix[i][n - 1 - i];

        }

        System.out.println("Sum of left diagonal: " + leftDiagonalSum); 
        System.out.println("Sum of right diagonal: " + rightDiagonalSum); 

        sc.close();
    }
}
