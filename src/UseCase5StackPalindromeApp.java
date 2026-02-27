import java.util.Stack;

/**
 * =========================================================
 * MAIN CLASS - UseCase5StackPalindromeApp
 * =========================================================
 *
 * Use Case 5: Stack-Based Palindrome Checker
 *
 * Goal:
 * Use Stack to reverse characters and validate palindrome.
 *
 * Concepts Used:
 * - Stack (LIFO)
 * - push() operation
 * - pop() operation
 * - Reversal logic using stack
 */

public class UseCase5StackPalindromeApp {

    public static void main(String[] args) {

        // Original string
        String input = "madam";

        System.out.println("========================================");
        System.out.println("   Stack-Based Palindrome Checker");
        System.out.println("========================================");

        System.out.println("Input String : " + input);

        // Create Stack
        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Pop characters to form reversed string
        String reversed = "";

        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        System.out.println("Reversed String : " + reversed);

        // Compare original and reversed
        if (input.equals(reversed)) {
            System.out.println("Result : It is a PALINDROME.");
        } else {
            System.out.println("Result : It is NOT a palindrome.");
        }

        System.out.println("========================================");
        System.out.println("Program executed successfully.");
    }
}