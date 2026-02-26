import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class UseCase6PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String word = scanner.nextLine();

        // 1️⃣ Create Stack (LIFO)
        Stack<Character> stack = new Stack<>();

        // 2️⃣ Create Queue (FIFO)
        Queue<Character> queue = new LinkedList<>();

        // 3️⃣ Insert characters into both
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));      // LIFO
            queue.add(word.charAt(i));      // FIFO
        }

        boolean isPalindrome = true;

        // 4️⃣ Compare pop() and dequeue()
        while (!stack.isEmpty()) {
            if (stack.pop() != queue.remove()) {
                isPalindrome = false;
                break;
            }
        }

        // 5️⃣ Display result
        if (isPalindrome) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("It is NOT a Palindrome");
        }

        scanner.close();
    }
}