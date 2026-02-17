import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Main class - PalindromeCheckerApp
 * Description: Checks for palindromes by comparing FIFO (Queue) vs LIFO (Stack).
 * @author Developer
 * @version 1.4
 */
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your input: ");
        S
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            stack.push(c);
            queue.add(c);
        }

        boolean isPalindrome = true;

        while (!queue.isEmpty()) {

            char fromQueue = Character.toLowerCase(queue.remove());
            char fromStack = Character.toLowerCase(stack.pop());

            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("\"" + input + "\" True");
        } else {
            System.out.println("\"" + input + "\" false");
        }

        sc.close();
    }
}
