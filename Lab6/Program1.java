import java.util.Scanner;

class Program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements for the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter index to access: ");
        int index = scanner.nextInt();
        try {
            System.out.println("Accessing index " + index + ": " + arr[index]);
        } 
		catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception in thread \"main\" ");
            System.out.println(e);
        }
    }
}