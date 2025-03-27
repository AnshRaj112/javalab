import java.io.*;
import java.util.Scanner;

class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first binary file name:");
        String file1 = sc.nextLine();
        System.out.println("Enter the second binary file name:");
        String file2 = sc.nextLine();

        try (FileInputStream fis1 = new FileInputStream(file1); FileInputStream fis2 = new FileInputStream(file2)) {
            int pos = 0, byte1, byte2;
            while ((byte1 = fis1.read()) != -1 && (byte2 = fis2.read()) != -1) {
                if (byte1 != byte2) {
                    System.out.println("Two files are not equal: byte position at which they differ is " + pos);
                    return;
                }
                pos++;
            }
            if (fis1.read() == fis2.read()) {
                System.out.println("Two files are equal");
            } else {
                System.out.println("Two files are not equal: byte position at which they differ is " + pos);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
