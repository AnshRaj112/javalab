import java.io.*;
import java.util.Scanner;

class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name:");
        String filename = sc.nextLine();

        int charCount = 0, wordCount = 0, lineCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                lineCount++;
                charCount += line.length();

                String[] words = line.split("[\\s,.;:!?]+");

                for (String word : words) {
                    if (word.matches("[a-zA-Z]+")) {  
                        wordCount++;
                    }
                }
            }

            System.out.println("No. of characters: " + charCount);
            System.out.println("No. of words: " + wordCount);
            System.out.println("No. of lines: " + lineCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
