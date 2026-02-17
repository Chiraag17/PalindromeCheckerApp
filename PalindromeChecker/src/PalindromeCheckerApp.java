import java.util.Scanner;

/**
 * Main class - PalindromeCheckerApp
 * Description: Checks for palindromes using a Singly Linked List and middle reversal.
 * @author Developer
 * @version 1.6
 */
class Node {
    char data;
    Node next;
    Node(char data) { this.data = data; }
}

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your input: ");
        String input = sc.nextLine();
        if (input.isEmpty()) return;

        Node head = new Node(input.charAt(0));
        Node current = head;
        for (int i = 1; i < input.length(); i++) {
            current.next = new Node(input.charAt(i));
            current = current.next;
        }

        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node secondHalf = reverseList(slow);
        Node firstHalf = head;
        Node secondHalfCopy = secondHalf;

        boolean isPalindrome = true;
        while (secondHalf != null) {
            if (Character.toLowerCase(firstHalf.data) != Character.toLowerCase(secondHalf.data)) {
                isPalindrome = false;
                break;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        System.out.println("\"" + input + "\" " + isPalindrome);
        sc.close();
    }

    private static Node reverseList(Node head) {
        Node prev = null, current = head, next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
