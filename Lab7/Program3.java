import java.io.*;
import java.util.Scanner;

class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the source file name:");
        String sourceFile = sc.nextLine();

        File source = new File(sourceFile);
        if (!source.exists()) {
            System.out.println("Error: Source file does not exist.");
            return;
        }

        System.out.println("Enter the destination file name:");
        String destinationFile = sc.nextLine();
        File destination = new File(destinationFile);

        try {
            if (destination.createNewFile()) {
                System.out.println("Destination file created: " + destinationFile);
            } else {
                System.out.println("Destination file already exists. Overwriting...");
            }

            try (FileReader fr = new FileReader(sourceFile); FileWriter fw = new FileWriter(destinationFile)) {
                int c;
                while ((c = fr.read()) != -1) {
                    fw.write(c);
                }
            }

            try (FileInputStream fis = new FileInputStream(sourceFile); FileOutputStream fos = new FileOutputStream(destinationFile)) {
                int b;
                while ((b = fis.read()) != -1) {
                    fos.write(b);
                }
            }

            System.out.println("File Copied Successfully");

        } catch (IOException e) {
            System.out.println("An error occurred while copying the file.");
            e.printStackTrace();
        }

        sc.close();
    }
}
