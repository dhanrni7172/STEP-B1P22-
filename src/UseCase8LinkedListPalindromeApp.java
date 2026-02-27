/**
 * =========================================================
 * MAIN CLASS - UseCase8LinkedListPalindromeApp
 * =========================================================
 *
 * Use Case 8: Linked List Based Palindrome Checker
 *
 * Goal:
 * Check palindrome using singly linked list.
 *
 * Concepts Used:
 * - Singly Linked List
 * - Node Traversal
 * - Fast and Slow Pointer Technique
 * - In-place reversal of second half
 */

public class UseCase8LinkedListPalindromeApp {

    // Node class for singly linked list
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        String input = "racecar";

        System.out.println("============================================");
        System.out.println("      Linked List Based Palindrome Checker");
        System.out.println("============================================");
        System.out.println("Input String : " + input);

        // Convert string to linked list
        Node head = buildLinkedList(input);

        // Check palindrome
        boolean isPalindrome = checkPalindrome(head);

        // Display result
        if (isPalindrome) {
            System.out.println("Result : It is a PALINDROME.");
        } else {
            System.out.println("Result : It is NOT a palindrome.");
        }

        System.out.println("============================================");
        System.out.println("Program executed successfully.");
    }

    // Build linked list from string
    private static Node buildLinkedList(String s) {
        Node head = null;
        Node tail = null;
        for (char c : s.toCharArray()) {
            Node newNode = new Node(c);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        return head;
    }

    // Check palindrome using fast & slow pointer and reverse
    private static boolean checkPalindrome(Node head) {
        if (head == null || head.next == null) return true;

        // Find middle (fast & slow pointers)
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        Node secondHalf = reverseList(slow.next);

        // Compare first half and second half
        Node firstHalf = head;
        Node secondPtr = secondHalf;
        boolean palindrome = true;
        while (secondPtr != null) {
            if (firstHalf.data != secondPtr.data) {
                palindrome = false;
                break;
            }
            firstHalf = firstHalf.next;
            secondPtr = secondPtr.next;
        }

        // Restore list (optional)
        slow.next = reverseList(secondHalf);

        return palindrome;
    }

    // Reverse linked list
    private static Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node nextTemp = current.next;
            current.next = prev;
            prev = current;
            current = nextTemp;
        }
        return prev;
    }
}