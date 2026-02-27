/**
 * =========================================================
 * MAIN CLASS - UseCase4CharArrayPalindromeApp
 * =========================================================
 *
 * Use Case 4: Character Array Based Palindrome Check
 *
 * Goal:
 * Convert string to character array and compare characters
 * using two-pointer technique.
 *
 * Concepts Used:
 * - char[] (Character Array)
 * - Array indexing
 * - Two-pointer approach
 * - Efficient comparison (no extra string creation)
 */

public class UseCase4CharArrayPalindromeApp {

    public static void main(String[] args) {

        // Original string
        String input = "radar";

        System.out.println("==========================================");
        System.out.println(" Character Array Based Palindrome Check ");
        System.out.println("==========================================");

        System.out.println("Input String : " + input);

        // Convert string to character array
        char[] characters = input.toCharArray();

        // Two-pointer technique
        int start = 0;
        int end = characters.length - 1;

        boolean isPalindrome = true;

        while (start < end) {

            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
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