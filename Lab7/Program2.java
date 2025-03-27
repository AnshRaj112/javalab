import java.io.*;
import java.util.Scanner;

class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student details - Rollno, Name, Subject, Marks:");
        int rollNo = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        String subject = sc.nextLine();
        int marks = sc.nextInt();

        System.out.println("Enter the file name:");
        sc.nextLine();
        String filename = sc.nextLine();

        try (FileWriter fw = new FileWriter(filename, true);
             BufferedWriter bw = new BufferedWriter(fw)) {
				bw.write(rollNo + "," + name + "," + subject + "," + marks);
				bw.newLine();
				System.out.println("Details saved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Reading the file content:");
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
