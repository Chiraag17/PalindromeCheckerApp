import java.util.Scanner;

/**
 * Main class - PalindromeCheckerApp
 * Description: Checks for palindromes using Recursion and the Call Stack.
 * @author Developer
 * @version 1.7
 */
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your input: ");
        String input = sc.nextLine();

        boolean isPalindrome = checkRecursive(input.toLowerCase(), 0, input.length() - 1);

        if (isPalindrome) {
            System.out.println("\"" + input + "\" True");
        } else {
            System.out.println("\"" + input + "\" false");
        }

        sc.close();
    }

    private static boolean checkRecursive(String str, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (str.charAt(start) != str.charAt(end)) {
            return false; // Mismatch found
        }

        return checkRecursive(str, start + 1, end - 1);
    }
}
