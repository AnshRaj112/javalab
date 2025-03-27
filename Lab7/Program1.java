import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String input = scanner.nextLine();

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Change case of the string");
            System.out.println("2. Reverse the string");
            System.out.println("3. Compare two strings");
            System.out.println("4. Insert one string into another");
            System.out.println("5. Convert to uppercase and lowercase");
            System.out.println("6. Check character presence and position");
            System.out.println("7. Check if the string is a palindrome");
            System.out.println("8. Count words, vowels, and consonants");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("The string after changing the case is: " + changeCase(input));
                    break;
                case 2:
                    System.out.println("The string after reversing is: " + reverseString(input));
                    break;
                case 3:
                    System.out.print("Enter the second string for comparison: ");
                    String secondString = scanner.nextLine();
                    compareStrings(input, secondString);
                    break;
                case 4:
                    System.out.print("Enter the string to be inserted into the first string: ");
                    String insertString = scanner.nextLine();
                    System.out.println("The string after insertion is: " + input + " " + insertString);
                    break;
                case 5:
                    System.out.println("Uppercase: " + input.toUpperCase());
                    System.out.println("Lowercase: " + input.toLowerCase());
                    break;
                case 6:
                    System.out.print("Enter a character: ");
                    char searchChar = scanner.next().charAt(0);
                    checkCharacterPosition(input, searchChar);
                    break;
                case 7:
                    if (isPalindrome(input))
                        System.out.println("Entered string is a palindrome");
                    else
                        System.out.println("Entered string is not a palindrome");
                    break;
                case 8:
                    countWordsVowelsConsonants(input);
                    break;
                case 9:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    public static String changeCase(String str) {
        StringBuilder result = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch))
                result.append(Character.toLowerCase(ch));
            else
                result.append(Character.toUpperCase(ch));
        }
        return result.toString();
    }

    public static String reverseString(String str) {
        char[] arr = str.toCharArray();
        int left = 0, right = arr.length - 1;
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return new String(arr);
    }

    public static void compareStrings(String str1, String str2) {
        int difference = str1.compareTo(str2);
        System.out.println("The difference between ASCII values is " + difference);
    }

    public static void checkCharacterPosition(String str, char ch) {
        int index = str.indexOf(ch);
        if (index != -1)
            System.out.println("Position of entered character: " + index);
        else
            System.out.println("Entered character is not present");
    }

    public static boolean isPalindrome(String str) {
        return str.equalsIgnoreCase(reverseString(str));
    }

    public static void countWordsVowelsConsonants(String str) {
        String[] words = str.split("\\s+");
        int vowels = 0, consonants = 0;
        for (char ch : str.toLowerCase().toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1)
                    vowels++;
                else
                    consonants++;
            }
        }
        System.out.println("No. of words: " + words.length);
        System.out.println("No. of vowels: " + vowels);
        System.out.println("No. of consonants: " + consonants);
    }
}
