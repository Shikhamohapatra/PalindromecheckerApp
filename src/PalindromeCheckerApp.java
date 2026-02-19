import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input text: ");
        String input = sc.nextLine();

        String reversed = new StringBuilder(input).reverse().toString();

        boolean isPalindrome = input.equalsIgnoreCase(reversed);

        System.out.println("check if it is a palindrome ? " + isPalindrome);

        sc.close();
    }
}
