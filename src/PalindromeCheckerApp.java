public class UseCase13PalindromeCheckerApp {

    // Algorithm 1: Two Pointer Method
    public static boolean isPalindromeTwoPointer(String str) {
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

    // Algorithm 2: Reverse String Method
    public static boolean isPalindromeReverse(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    public static void main(String[] args) {

        String input = "madam";

        // Measure time for Two Pointer
        long start1 = System.nanoTime();
        boolean result1 = isPalindromeTwoPointer(input);
        long end1 = System.nanoTime();

        // Measure time for Reverse Method
        long start2 = System.nanoTime();
        boolean result2 = isPalindromeReverse(input);
        long end2 = System.nanoTime();

        System.out.println("Two Pointer Result: " + result1);
        System.out.println("Execution Time: " + (end1 - start1) + " ns");

        System.out.println();

        System.out.println("Reverse Method Result: " + result2);
        System.out.println("Execution Time: " + (end2 - start2) + " ns");
    }
}