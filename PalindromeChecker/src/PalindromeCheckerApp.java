import java.util.Scanner; // Required import for user input

public class PalindromeCheckerApp {
    /**
     * Main class - PalindromeCheckerApp
     * Description:
     * This class represents the entry point of the
     * Palindrome Checker Management system.
     * @author Developer
     * @version 1.1
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your input: ");
        String input = sc.nextLine();

        boolean isPalindrome = true;
        int len = input.length();


        for (int i = 0; i < len / 2; i++) {

            if (input.charAt(i) != input.charAt(len - 1 - i)) {
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
