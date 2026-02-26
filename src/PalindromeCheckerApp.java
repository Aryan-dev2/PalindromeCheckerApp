import java.util.Scanner;

public class PalindromeCheckerApp {

    static final String APP_NAME = "Palindrome Checker App";
    static final String VERSION = "Version 1.0";

    public static void main(String[] args) {

        // ------------------ UC1 ------------------
        System.out.println("==================================");
        System.out.println("Welcome to " + APP_NAME);
        System.out.println(VERSION);
        System.out.println("==================================");

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nChoose an Option:");
            System.out.println("1. Basic Palindrome Check");
            System.out.println("2. Case-Insensitive Palindrome Check");
            System.out.println("3. Ignore Spaces & Special Characters");
            System.out.println("4. Hardcoded Palindrome (UC2)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter a string: ");
                    String input1 = scanner.nextLine();
                    if (isPalindromeBasic(input1)) {
                        System.out.println("Result: It is a Palindrome (Case-Sensitive).");
                    } else {
                        System.out.println("Result: Not a Palindrome.");
                    }
                    break;

                case 2:
                    System.out.print("Enter a string: ");
                    String input2 = scanner.nextLine();
                    if (isPalindromeIgnoreCase(input2)) {
                        System.out.println("Result: It is a Palindrome (Case-Insensitive).");
                    } else {
                        System.out.println("Result: Not a Palindrome.");
                    }
                    break;

                case 3:
                    System.out.print("Enter a string: ");
                    String input3 = scanner.nextLine();
                    if (isPalindromeAdvanced(input3)) {
                        System.out.println("Result: It is a Valid Palindrome.");
                    } else {
                        System.out.println("Result: Not a Palindrome.");
                    }
                    break;

                // ------------------ UC2 ------------------
                case 4:
                    String word = "madam";
                    String reversed = new StringBuilder(word).reverse().toString();

                    if (word.equals(reversed)) {
                        System.out.println(word + " is a Palindrome");
                    } else {
                        System.out.println(word + " is NOT a Palindrome");
                    }
                    break;

                case 5:
                    System.out.println("Thank you for using " + APP_NAME + "!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        scanner.close();
    }

    public static boolean isPalindromeBasic(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    public static boolean isPalindromeIgnoreCase(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);
    }

    public static boolean isPalindromeAdvanced(String str) {
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }
}git checkout develop