import java.util.Scanner;

/**
 * Main class - PalindromeCheckerApp
 * Description: Checks for palindromes using a char array and two-pointer approach.
 * @author Developer
 * @version 1.2
 */
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your input: ");
        String input = sc.nextLine();
        char[] charArray = input.toCharArray();
        boolean isPalindrome = true;
        int left = 0;
        int right = charArray.length - 1;
        while (left < right) {
            if (Character.toLowerCase(charArray[left]) != Character.toLowerCase(charArray[right])) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        if (isPalindrome) {
            System.out.println("\"" + input + "\" True");
        } else {
            System.out.println("\"" + input + "\" false");
        }
        sc.close();
    }
}
