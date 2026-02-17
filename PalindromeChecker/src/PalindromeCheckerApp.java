import java.util.Scanner;

/**
 * Main class - PalindromeCheckerApp
 * Description: Checks for palindromes by creating a reversed string.
 * @author Developer
 * @version 1.1
 */
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your input: ");
        String input = sc.nextLine();
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {

            reversed += input.charAt(i);
        }
        if (input.equalsIgnoreCase(reversed)) {
            System.out.println("\"" + input + "\" True");
        } else {
            System.out.println("\"" + input + "\" false");
        }
        sc.close();
    }
}
