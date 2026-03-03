import java.util.Scanner;

/**
 * Main class - PalindromeCheckerApp
 * Description: Robust palindrome checker that ignores case, spaces, and punctuation.
 * @author Developer
 * @version 1.8
 */
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your input: ");
        String input = sc.nextLine();

        String normalized = input.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        boolean isPalindrome = checkPalindrome(normalized);

        if (isPalindrome && !normalized.isEmpty()) {
            System.out.println("Input: \"" + input + "\" -> Normalized: \"" + normalized + "\"");
            System.out.println("Result: True");
        } else {
            System.out.println("Result: False");
        }

        sc.close();
    }

    private static boolean checkPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
