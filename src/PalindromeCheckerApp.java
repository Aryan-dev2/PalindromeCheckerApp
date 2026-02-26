import java.util.Scanner;

public class PalindromeCheckerApp {

    // App Version
    static final String APP_NAME = "Palindrome Checker App";
    static final String VERSION = "Version 1.0";

    public static void main(String[] args) {

        // ------------------ UC1 ------------------
        // Application Entry & Welcome Message
        System.out.println("==================================");
        System.out.println("Welcome to " + APP_NAME);
        System.out.println(VERSION);
        System.out.println("==================================");

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Menu
            System.out.println("\nChoose an Option:");
            System.out.println("1. Basic Palindrome Check");
            System.out.println("2. Case-Insensitive Palindrome Check");
            System.out.println("3. Ignore Spaces & Special Characters");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {

                // ------------------ UC2 & UC3 ------------------
                case 1:
                    System.out.print("Enter a string: ");
                    String input1 = scanner.nextLine();
                    if (isPalindromeBasic(input1)) {
                        System.out.println("Result: It is a Palindrome (Case-Sensitive).");
                    } else {
                        System.out.println("Result: Not a Palindrome.");
                    }
                    break;

                // ------------------ UC4 ------------------
                case 2:
                    System.out.print("Enter a string: ");
                    String input2 = scanner.nextLine();
                    if (isPalindromeIgnoreCase(input2)) {
                        System.out.println("Result: It is a Palindrome (Case-Insensitive).");
                    } else {
                        System.out.println("Result: Not a Palindrome.");
                    }
                    break;

                // ------------------ UC5 ------------------
                case 3:
                    System.out.print("Enter a string: ");
                    String input3 = scanner.nextLine();
                    if (isPalindromeAdvanced(input3)) {
                        System.out.println("Result: It is a Valid Palindrome (Ignoring spaces & special characters).");
                    } else {
                        System.out.println("Result: Not a Palindrome.");
                    }
                    break;

                // ------------------ UC6 ------------------
                case 4:
                    System.out.println("Thank you for using " + APP_NAME + "!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);

        scanner.close();
    }

    // Basic palindrome check (case-sensitive)
    public static boolean isPalindromeBasic(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    // Case-insensitive palindrome check
    public static boolean isPalindromeIgnoreCase(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);
    }

    // Advanced palindrome check (ignore spaces & special characters)
    public static boolean isPalindromeAdvanced(String str) {
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }
}