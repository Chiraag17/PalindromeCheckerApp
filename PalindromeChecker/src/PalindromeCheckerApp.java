package src;

import java.util.Scanner;
import java.util.Stack;

/**
 * =============================================================================
 * MAIN CLASS - UseCase13PalindromeCheckerApp
 * =============================================================================
 *
 * Use Case 13: Performance Comparison
 *
 * Description:
 * This class measures and compares the execution
 * performance of palindrome validation algorithms.
 *
 * At this stage, the application:
 * - Uses a palindrome strategy implementation
 * - Captures execution start and end time
 * - Calculates total execution duration
 * - Displays benchmarking results
 *
 * This use case focuses purely on performance
 * measurement and algorithm comparison.
 *
 * The goal is to introduce benchmarking concepts.
 *
 * @author Developer
 * @version 13.0
 */
public class PalindromeCheckerApp {

    /**
     * Application entry point for UC13.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your input for performance testing: ");
        String input = sc.nextLine();

        // Using Stack-based strategy for benchmarking
        PalindromeStrategy strategy = new StackStrategy();

        // Capture execution start time in nanoseconds
        long startTime = System.nanoTime();

        boolean isPalindrome = strategy.checkPalindrome(input);

        // Capture execution end time
        long endTime = System.nanoTime();

        // Calculate total execution duration
        long duration = endTime - startTime;

        System.out.println("Result: " + (isPalindrome ? "True" : "False"));
        System.out.println("Execution Time: " + duration + " nanoseconds");

        sc.close();
    }
}

/**
 * INTERFACE - PalindromeStrategy
 */
interface PalindromeStrategy {
    boolean checkPalindrome(String input);
}
class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean checkPalindrome(String input) {
        String normalized = input.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        if (normalized.isEmpty()) return false;

        Stack<Character> stack = new Stack<>();
        for (char c : normalized.toCharArray()) {
            stack.push(c);
        }

        for (char c : normalized.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}
