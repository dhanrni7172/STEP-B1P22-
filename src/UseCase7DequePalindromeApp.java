import java.util.Deque;
import java.util.LinkedList;

/**
 * =========================================================
 * MAIN CLASS - UseCase7DequePalindromeApp
 * =========================================================
 *
 * Use Case 7: Deque-Based Optimized Palindrome Checker
 *
 * Goal:
 * Use Deque to compare front and rear elements efficiently.
 *
 * Concepts Used:
 * - Deque (Double Ended Queue)
 * - Front & Rear Access
 * - Optimized palindrome check
 */

public class UseCase7DequePalindromeApp {

    public static void main(String[] args) {

        // Input string
        String input = "level";

        System.out.println("==========================================");
        System.out.println("      Deque-Based Palindrome Checker");
        System.out.println("==========================================");

        System.out.println("Input String : " + input);

        // Create deque
        Deque<Character> deque = new LinkedList<>();

        // Insert all characters into deque
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare front and rear until deque is empty or mismatch
        while (deque.size() > 1) {

            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println("Result : It is a PALINDROME.");
        } else {
            System.out.println("Result : It is NOT a palindrome.");
        }

        System.out.println("==========================================");
        System.out.println("Program executed successfully.");
    }
}