import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

/**
 * =========================================================
 * MAIN CLASS - UseCase6QueueStackPalindromeApp
 * =========================================================
 *
 * Use Case 6: Queue + Stack Based Palindrome Check
 *
 * Goal:
 * Demonstrate FIFO vs LIFO using Queue and Stack.
 *
 * Concepts Used:
 * - Queue (FIFO)
 * - Stack (LIFO)
 * - Enqueue & Dequeue
 * - Push & Pop
 * - Logical comparison
 */

public class UseCase6QueueStackPalindromeApp {

    public static void main(String[] args) {

        // Original string
        String input = "racecar";

        System.out.println("==============================================");
        System.out.println("   Queue + Stack Based Palindrome Checker");
        System.out.println("==============================================");

        System.out.println("Input String : " + input);

        // Create Queue (FIFO)
        Queue<Character> queue = new LinkedList<>();

        // Create Stack (LIFO)
        Stack<Character> stack = new Stack<>();

        // Enqueue and Push characters
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            queue.add(ch);   // Enqueue
            stack.push(ch);  // Push
        }

        boolean isPalindrome = true;

        // Compare Dequeue vs Pop
        while (!queue.isEmpty()) {

            char fromQueue = queue.remove(); // Dequeue (FIFO)
            char fromStack = stack.pop();    // Pop (LIFO)

            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }

        // Display Result
        if (isPalindrome) {
            System.out.println("Result : It is a PALINDROME.");
        } else {
            System.out.println("Result : It is NOT a palindrome.");
        }

        System.out.println("==============================================");
        System.out.println("Program executed successfully.");
    }
}