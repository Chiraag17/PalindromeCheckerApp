import java.util.Scanner;
import java.util.Stack;
/**
 * Main class - PalindromeCheckerApp
 * Description: Checks for palindromes using a Stack (LIFO principle).
 * @author Developer
 * @version 1.3
 */
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your input: ");
        String input = sc.nextLine();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }
        boolean isPalindrome = true;

        for (int i = 0; i < input.length(); i++) {
            char originalChar = input.charAt(i);
            char reversedChar = stack.pop();

            if (Character.toLowerCase(originalChar) != Character.toLowerCase(reversedChar)) {
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
