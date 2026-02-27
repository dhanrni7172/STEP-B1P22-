/**
 * =========================================================
 * MAIN CLASS - UseCase3PalindromeReverseApp
 * =========================================================
 *
 * Use Case 3: Palindrome Check Using String Reverse
 *
 * Goal:
 * Check whether a string is a palindrome by reversing it.
 *
 * Concepts Used:
 * - for loop
 * - String immutability
 * - String concatenation
 * - equals() method
 */

public class UseCase3PalindromeReverseApp {

    public static void main(String[] args) {

        // Original string
        String original = "level";

        System.out.println("====================================");
        System.out.println(" Palindrome Check - Reverse Method ");
        System.out.println("====================================");

        System.out.println("Original String : " + original);

        // Reverse the string using loop
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        System.out.println("Reversed String : " + reversed);

        // Compare original and reversed
        if (original.equals(reversed)) {
            System.out.println("Result : It is a PALINDROME.");
        } else {
            System.out.println("Result : It is NOT a palindrome.");
        }

        System.out.println("====================================");
        System.out.println("Program finished successfully.");
    }
}