import java.util.Scanner;

public class UseCase3PalindromeCheckerApp {

    public static void main(String[] args) {

        // Take input from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String word = scanner.nextLine();

        // Reverse string using loop
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Compare original and reversed
        if (word.equals(reversed)) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("It is NOT a Palindrome");
        }

        scanner.close();
    }
}