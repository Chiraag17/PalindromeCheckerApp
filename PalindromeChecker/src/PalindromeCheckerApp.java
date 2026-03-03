import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

/**
 * Main class - PalindromeCheckerApp
 * Description: Checks for palindromes using a Deque (Double-Ended Queue).
 * @author Developer
 * @version 1.5
 */
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your input: ");
        String input = sc.nextLine();

        Deque<Character> deque = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }
        boolean isPalindrome = true;


        while (deque.size() > 1) {

            char first = Character.toLowerCase(deque.removeFirst());
            char last = Character.toLowerCase(deque.removeLast());

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        // Flow: Print result
        if (isPalindrome) {
            System.out.println("\"" + input + "\" True");
        } else {
            System.out.println("\"" + input + "\" false");
        }

        sc.close();
    }
}
