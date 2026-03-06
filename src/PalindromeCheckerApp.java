public class PalindromeCheckerApp {

    static boolean isPalindrome(String str) {

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {

            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        String input = "Madam In Eden Im Adam";

        // Normalize string
        String normalized = input.toLowerCase().replaceAll("\\s+", "");

        if (isPalindrome(normalized)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}