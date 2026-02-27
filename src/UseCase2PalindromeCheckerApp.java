/**
 * =========================================================
 * MAIN CLASS - UseCase2PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 2: Print a Hardcoded Palindrome Result
 *
 * Goal:
 * Display whether a hardcoded string is a palindrome.
 *
 * @author Developer
 * @version 1.0
 */

public class UseCase2PalindromeCheckerApp {

    /**
     * Application entry point.
     */
    public static void main(String[] args) {

        // Hardcoded string
        String word = "madam";

        System.out.println("====================================");
        System.out.println("   Palindrome Checker - UC2");
        System.out.println("====================================");
        System.out.println("Given Word : " + word);

        // Reverse the string
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Check palindrome using if-else
        if (word.equals(reversed)) {
            System.out.println("Result : The word is a PALINDROME.");
        } else {
            System.out.println("Result : The word is NOT a palindrome.");
        }

        System.out.println("====================================");
        System.out.println("Program executed successfully.");
    }
}